package POO.Lista1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = Integer.parseInt(sc.nextLine());

        if(idade < 16) {
            System.out.println("Você não pode votar");
        } else {
            System.out.println("Você pode votar");
        }
    }
}
