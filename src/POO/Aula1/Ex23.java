package POO.Aula1;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100);
        int guess;

        System.out.println("Digite seu chute");
        guess = Integer.parseInt(sc.nextLine());

        while (guess != num) {
            if (guess > num) {
                System.out.println("Seu chute é maior que o valor");

            } else {
                System.out.println("Seu chute é menor que o valor");

            }
            System.out.println("Digite seu chute");
            guess = Integer.parseInt(sc.nextLine());

        }

        System.out.println("Você acertou!");
    }
}
