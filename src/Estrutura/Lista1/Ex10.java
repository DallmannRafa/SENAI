package Estrutura.Lista1;

import java.util.Scanner;

//Crie um programa que leia dois vetores A e B com 5 elementos cada. Verifique se eles são iguais, ou seja, se possuem os
//mesmos valores nas mesmas posições.
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[5];
        int[] vectorB = new int[5];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor A");
            vectorA[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor B");
            vectorB[i] = Integer.parseInt(sc.nextLine());
        }

        boolean igual = true;

        for (int i = 0; i < vectorA.length; i++) {
            if(vectorA[i] != vectorB[i]) {
                igual = false;
                break;
            }
        }

        if (igual) {
            System.out.println("Os vetores são iguais");
        }
    }
}
