package Estrutura.Lista1;

import java.util.Scanner;

//Escreva um programa que leia 10 números inteiros e armazene-os em um vetor. Em seguida, exiba apenas os números pares
//do vetor.
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 2 == 0) {
                System.out.println(vector[i]);
            }
        }
    }
}
