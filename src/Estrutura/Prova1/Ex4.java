package Estrutura.Prova1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[8];

        int soma = 0;

        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                vector[i] = 99;

            } else {
                System.out.println("Informe um valor");
                vector[i] = Integer.parseInt(sc.nextLine());

                vector[i - 1] = vector[i] * 2;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            soma += vector[i];
        }

        System.out.println("A soma calculada iterativamente é " + soma);
        System.out.println("A soma calculada recursivamente é " + calculaRecursivo(vector, vector.length));
    }

    public static int calculaRecursivo (int[] vector, int quant) {

        if (quant == 1) {
            return vector[quant - 1];
        } else {
            return vector[quant - 1] + calculaRecursivo(vector, quant - 1);
        }
    }
}
