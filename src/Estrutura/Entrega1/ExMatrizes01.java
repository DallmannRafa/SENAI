package Estrutura.Entrega1;

import java.util.Scanner;

public class ExMatrizes01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrixSum = new int[3][3];

        System.out.println("Primeira matriz");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Informe o " + (j + 1) + "º valor da " + (i + 1) + "ª linha");
                matrix1[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Segunda matriz");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Informe o " + (j + 1) + "º valor da " + (i + 1) + "ª linha");
                matrix2[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Soma");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixSum[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
