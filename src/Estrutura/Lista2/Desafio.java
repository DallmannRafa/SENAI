package Estrutura.Lista2;

import java.util.Random;

public class Desafio {
    public static void main(String[] args) {

        int[][] matrixBase = new int[10][10];
        int[][] matrix = new int[3][3];

        Random value = new Random();

        for (int i = 0; i < matrixBase.length; i++) {
            for (int j = 0; j < matrixBase[i].length; j++) {
                matrixBase[i][j] = value.nextInt(0,2);
            }
        }

        for (int i = 0; i < matrixBase.length; i++) {
            for (int j = 0; j < matrixBase.length; j++) {

                System.out.print(matrixBase[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value.nextInt(0,2);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < matrixBase.length - (matrix.length - 1); i++) {
            for (int j = 0; j < matrixBase[i].length - (matrix.length - 1); j++) {

                if(
                        matrixBase[i][j] == matrix[0][0] &&
                        matrixBase[i][j + 1] == matrix[0][1] &&
                        matrixBase[i][j + 2] == matrix[0][2] &&

                        matrixBase[i + 1][j] == matrix[1][0] &&
                        matrixBase[i + 1][j + 1] == matrix[1][1] &&
                        matrixBase[i + 1][j + 2] == matrix[1][2] &&

                        matrixBase[i + 2][j] == matrix[2][0] &&
                        matrixBase[i + 2][j + 1] == matrix[2][1] &&
                        matrixBase[i + 2][j + 2] == matrix[2][2]
                ) {
                    count++;
                }

            }


        }

        System.out.println("count = " + count);
    }
}
