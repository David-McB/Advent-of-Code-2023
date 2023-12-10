package com.adventofcode;
import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello");
        Day1 day1 = new Day1(INPUT_SET.A);
        String result = day1.solve();
        System.out.println(result);

    }
}
