package Estrutura.Lista2;

import java.util.Scanner;

//Crie um programa que verifique se uma matriz é simétrica (igual à
//sua transposta).
public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        boolean simetrical = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Informe o " + (j + 1) + "º valor da " + (i + 1) + "ª linha");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    simetrical = false;
                }
            }
        }

        System.out.println("Soma");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        if (simetrical) {
            System.out.println("A matriz é simétrica");
        } else {
            System.out.println("A matriz não é simétrica");
        }
    }
}
