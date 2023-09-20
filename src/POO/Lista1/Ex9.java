package POO.Lista1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Informe o primeiro número");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Informe o segundo número");
        num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Adição: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multipliação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

    }
}
