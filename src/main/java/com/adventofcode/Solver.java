package com.adventofcode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class Solver {
    private final int day;
    String pathFormat;

    // Constructor used only when subclass is created
    protected Solver(int day, String pathFormat) throws IOException {
        this.day = day;
        this.pathFormat = pathFormat;
    }

    private Path generatePath() {
        String fileName = String.format(this.pathFormat, this.day);
        System.out.println("filename:" + fileName);
        return Path.of(fileName);
    }

    List<String> getInputLines() throws IOException {
        Path path = generatePath();
        return Files.readAllLines(path);
    }

    String getInput() throws IOException {
        Path path = generatePath();
        return Files.readString(path);
    }

    abstract String solve();
}
