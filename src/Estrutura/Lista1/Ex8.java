package Estrutura.Lista1;

import java.util.Scanner;

//Faça um programa que leia dois vetores A e B com 5 elementos cada. Crie um vetor C que seja a soma dos elementos
//correspondentes de A e B. Exiba o vetor C.
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[5];
        int[] vectorB = new int[5];
        int[] vectorC = new int[5];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor A");
            vectorA[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor B");
            vectorB[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + ", ");
        }
    }
}
