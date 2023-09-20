package POO.Lista2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0, count = 1, fatorial;

        while (num < 2 || num > 5) {
            System.out.println("Informe um número");
            num = Integer.parseInt(sc.nextLine());

            if (num < 2 || num > 5) {
                System.out.println("Número incorreto, informe entrre 2 e 5");

            } else {

                fatorial = num;

                while (count < num) {
                    fatorial *= num - count;
                    count++;
                }

                System.out.println("O fatorial é " + fatorial);
            }
        }

    }
}
