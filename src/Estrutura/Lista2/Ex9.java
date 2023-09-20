package Estrutura.Lista2;

import java.util.Random;
import java.util.Scanner;

//Desenvolva um programa que verifique se um determinado
//elemento está presente em um vetor.
public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random generator = new Random();

        int[] vector = new int[10];
        int guess;
        boolean exists = false;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = generator.nextInt(0,100);

        }

        System.out.println("Informe um número");
        guess = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == guess) {
                exists = true;
            }
        }

        if(exists) {
            System.out.println("Esse valor existe no vetor");
        } else {
            System.out.println("Esse valor não existe no vetor");
        }
    }
}
