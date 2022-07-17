package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinate = getCoordinate(scanner);


        Point A = new Point(coordinate[0], coordinate[1]);
        Point C = new Point(coordinate[2], coordinate[3]);

        Rectangle rectangle = new Rectangle(A, C);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] pointCoordinates = getCoordinate(scanner);

            Point x = new Point(pointCoordinates[0], pointCoordinates[1]);

            boolean isInside = rectangle.contains(x);
            System.out.println(isInside);

        }
    }

    private static int[] getCoordinate(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
