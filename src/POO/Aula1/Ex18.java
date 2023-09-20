package POO.Aula1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.println("Informe um ano");
        year = Integer.parseInt(sc.nextLine());

        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é um ano bissexto");
        }
    }
}
