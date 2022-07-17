package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPossition(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillInGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPossition(command);
            int[] evilPosition = readPossition(scanner.nextLine());

            int currentRowEvil = evilPosition[0];
            int currentColEvil = evilPosition[1];

            while (currentRowEvil >= 0 && currentColEvil >= 0) {
                if (currentRowEvil < galaxy.length && currentColEvil < galaxy[0].length) {
                    galaxy[currentRowEvil][currentColEvil] = 0;
                }
                currentRowEvil--;
                currentColEvil--;
            }

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];

            while (currentRowJedi >= 0 && currentColJedi < galaxy[1].length) {
                if (currentRowJedi < galaxy.length && currentColJedi >= 0 && currentColJedi < galaxy[0].length) {
                    starsCollected += galaxy[currentRowJedi][currentColJedi];
                }

                currentColJedi++;
                currentRowJedi--;
            }

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);


    }

    private static int[] readPossition(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillInGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }
}
