package Estrutura.Entrega1;

import java.util.Scanner;

public class ExPrimitivos04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um número");
        num = Integer.parseInt(sc.nextLine());

        if( num % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }
}
