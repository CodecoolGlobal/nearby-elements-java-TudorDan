package main.java.com.codecool.nearby;

import java.util.Arrays;

public class GetNearbyElements {
    private static final int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public static int[] nearby(int x, int y, int range) {
        int[] solution = {};

        if (x >= 0 && x < multi.length && y >= 0 && y < multi[x].length) {
            int indexLeft = Math.max(0, y - range);
            int indexRight = Math.min(y + range, multi[x].length - 1);

            // left range
            for (int i = indexLeft; i < y; i++) {
                solution = Arrays.copyOf(solution, solution.length + 1);
                solution[solution.length - 1] = multi[x][i];
            }

            // right range
            for (int i = y + 1; i <= indexRight; i++) {
                solution = Arrays.copyOf(solution, solution.length + 1);
                solution[solution.length - 1] = multi[x][i];
            }
        }

        return solution;
    }
}
