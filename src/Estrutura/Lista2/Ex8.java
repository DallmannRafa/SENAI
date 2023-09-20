package Estrutura.Lista2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int[] vectorInverse = new int[10];


        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vector.length; i++) {
            vectorInverse[i] = vector[vector.length - (i + 1)];
        }

    }
}
