package com.adventofcode;
import java.util.List;
import java.io.IOException;

public class Day1 extends Solver {

    public Day1() throws IOException {
        // Call parent constructor and provide day number
        super(1, "inputs/david/day%02d.txt");
    }

    public Day1(INPUT_SET inputSet) throws IOException {
        super(1, inputSet == INPUT_SET.A ? "inputs/david/day%02d.txt" : "inputs/joel/day%02d.txt");
    }

    private final List<String> inputLines = getInputLines();

    @Override
    String solve() {
        int sum = 0;

        for (String line : this.inputLines) {
            int num = 0;

            // find first digit
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (Character.isDigit(c)) {
                    num += Character.getNumericValue(c) * 10;
                    break;
                }
            }

            // find last digit
            for (int i = line.length() - 1; i >= 0; i--) {
                char c = line.charAt(i);

                if (Character.isDigit(c)) {
                    num += Character.getNumericValue(c);
                    break;
                }
            }

            sum += num;
        }
        return Integer.toString(sum);

        // match first
        // .*?(\d|one|two|three|four|five|six).*
        // match last
        // .*(\d|one).*?
    }
}
