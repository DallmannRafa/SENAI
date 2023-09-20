package Estrutura.Lista1;

import java.util.Scanner;

//Crie um programa que leia dois vetores A e B com 5 elementos cada. Em seguida, gere um vetor C (com 10 posições) que seja
//a concatenação dos vetores A e B. Exiba o vetor C.
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        int[] vectorC = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor A");
            vectorA[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor B");
            vectorB[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vectorC.length; i++) {
            if (i <= vectorA.length - 1) {
                vectorC[i] = vectorA[i];
            } else {
                vectorC[i] = vectorB[i - vectorA.length];
            }
        }

        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + ", ");
        }
    }
}
