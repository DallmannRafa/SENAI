package Estrutura.Lista2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "º número");
            sum += Integer.parseInt(sc.nextLine());
        }

        System.out.println("A média é " + (sum / 5));

    }
}
