package POO.Lista2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        String nome;

        System.out.println("Qal o nome?");
        nome = sc.nextLine();

        while (num < 2 || num > 10) {
            System.out.println("Informe o númeo");
            num = Integer.parseInt(sc.nextLine());

            if(num < 2 || num > 10) {
                System.out.println("Número inválido");
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(nome);
        }
    }
}
