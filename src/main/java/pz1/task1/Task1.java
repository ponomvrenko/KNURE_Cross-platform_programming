package pz1.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input c: ");
        int c = scanner.nextInt();

        for (double a = 0; a < 6; a += 0.1) {
            for (double b = -2; b < 6; b += 0.2) {
                double x = xFunction(a, b, c);
                System.out.println("x = " + x + "\t y = " + yFunction(x, a));
            }
        }
    }

    private static double yFunction(double x, double a) {
        if (x == 0 && a != Math.PI) {
            return Math.cos(9 * x) - Math.cos(7 * x) + Math.cos(3 * a) - Math.cos(x);
        } else {
            return Math.sin(3 * x) + Math.sin(5 * a) - Math.sin(4 * x);
        }
    }

    private static double xFunction(double a, double b, int c) {
        if (b <= 0) {
            return 3 * a * b - (Math.abs(3.5 * c - 56) + Math.sqrt(Math.abs(b)));
        } else if (b > 0.5) {
            return Math.pow(Math.cos(a / 2.0), 2) + Math.pow(Math.cos(3 / 2.0 * b), 2) -
                    Math.pow(Math.sin(2 * a * b), 2) - Math.pow(Math.sin(4 * b), 2);
        } else {
            return 3.5 * a * b;
        }
    }
}