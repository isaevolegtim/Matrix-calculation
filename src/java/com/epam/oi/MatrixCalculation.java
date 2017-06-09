package com.epam.oi;

public class MatrixCalculation {

    public void calculate () {
        int[][] m = {{1, 4, 6}, {8, 9, 0}, {2, 5, 3}};

        for (int x = 0; x < m.length; x++) {
            for (int y = 0; y < m.length; y++) {
                System.out.print(m[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] n = {{1, 4, 6}, {8, 9, 0}, {2, 5, 3}};

        for (int x = 0; x < n.length; x++) {
            for (int y = 0; y < n.length; y++) {
                System.out.print(n[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] z = new int[3][3];

        for (int x = 0; x < z.length; x++) {
            for (int y = 0; y < z.length; y++) {
                int multiply = m[x][y]*n[x][y];
                System.out.print(multiply + " ");
            }
            System.out.println();
        }
    }
}
