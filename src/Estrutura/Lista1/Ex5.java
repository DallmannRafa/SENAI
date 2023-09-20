package Estrutura.Lista1;

import java.util.Scanner;

//Faça um programa que leia um vetor com 6 elementos numéricos e calcule a média aritmética dos valores. Em seguida, exiba
//os elementos do vetor que são maiores do que a média calculada.
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[6];

        int soma = 0, media;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());

            soma += vector[i];
        }

        media = soma / vector.length;

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > media){
                System.out.println("O número " + vector[i] + " é maior que a média");
            }
        }

    }
}
