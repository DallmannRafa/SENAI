package Estrutura.Lista2;

import java.util.Random;
import java.util.Scanner;

//Crie um programa que conte quantas vezes um valor específico
//aparece em um vetor de inteiros.
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random generator = new Random();

        int[] vector = new int[100];
        int guess,count = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = generator.nextInt(0,100);

        }

        System.out.println("Informe um número");
        guess = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == guess) {
                count++;
            }
        }

        System.out.println("Esse valor aparece " + count + " vezes no vetor");
    }
}
