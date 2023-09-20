package Estrutura.Entrega1;

import java.util.Scanner;

public class ExVetores02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int num, biggest = 0, smallest = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor");
            num = Integer.parseInt(sc.nextLine());

            if (num > biggest || i == 0) {
                biggest = num;
            }
            if (num < smallest || i == 0){
                smallest = num;
            }

        }

        System.out.println("O maior é " + biggest);
        System.out.println("O menor é " + smallest);
    }
}
