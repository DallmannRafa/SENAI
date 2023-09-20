package Estrutura.Lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um número");
        num = Integer.parseInt(sc.nextLine());

        if (num < 0) {
            System.out.println("O número é negativo");
        } else if (num == 0) {
            System.out.println("O número é zero");
        } else {
            System.out.println("O número é positivo");
        }
    }

}
