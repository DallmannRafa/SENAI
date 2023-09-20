package Estrutura.Lista1;

import java.util.Scanner;

//Crie um programa que leia um vetor de 10 números inteiros e exiba o maior e o menor valor presente no vetor
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int maior, menor;

        System.out.println("Informe o 1º número");
        maior = Integer.parseInt(sc.nextLine());
        menor = maior;

        for (int i = 1; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());

            if(vector[i] > maior){
                maior = vector[i];
            } else if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("O maior número foi " + maior);
        System.out.println("O menor número foi " + menor);
    }
}
