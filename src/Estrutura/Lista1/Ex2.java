package Estrutura.Lista1;

import java.util.Scanner;

//Crie um programa que leia 10 números inteiros e armazene-os em um vetor. Em seguida, exiba a soma de todos os números
//do vetor.
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int soma = 0, valor;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());
            soma += vector[i];
        }

        System.out.println("Resultado: " + soma);
    }
}
