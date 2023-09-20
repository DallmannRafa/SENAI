package Estrutura.Lista1;

import java.util.Scanner;

//Escreva um programa que leia um vetor com 5 elementos numéricos e ordene-os em ordem crescente. Em seguida, exiba o
//vetor ordenado.
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do vetor A");
            vector[i] = Integer.parseInt(sc.nextLine());
        }

        boolean trocou = true;
        int loops = vector.length - 1;
        int temp;

        while(trocou) {
            trocou = false;
            for (int i = 0; i < loops; i++) {
                if (vector[i] > vector[i + 1]) {
                    temp = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = temp;
                    trocou = true;

                }

            }
            loops--;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
