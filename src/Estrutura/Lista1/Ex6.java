package Estrutura.Lista1;

import java.util.Scanner;

//Escreva um programa que leia um vetor com 8 elementos numéricos e verifique quantos deles são negativos. Em seguida,
//exiba essa quantidade.
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[8];

        int quantNegativos = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            vector[i] = Integer.parseInt(sc.nextLine());

            if (vector[i] < 0) {
                quantNegativos++;
            }
        }

        System.out.println("Foram informados " + quantNegativos + " números negativos");
    }
}
