package Estrutura.Entrega1;

import java.util.Scanner;

public class ExMatrizes04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int multiplier;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Informe o " + (j + 1) + "º valor da " + (i + 1) + "ª linha");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Qual o valor da multiplicação?");
        multiplier = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= multiplier;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
