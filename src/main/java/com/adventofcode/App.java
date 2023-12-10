package com.adventofcode;
import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello");
        Day1 solution = new Day1(INPUT_SET.A);
        String result = solution.solve();
        System.out.println(result);

    }
}
