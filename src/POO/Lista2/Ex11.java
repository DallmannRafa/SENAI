package POO.Lista2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menor = 0, maior = 0, soma = 0, media;

        for (int i = 0; i < 20; i++) {
            int num = -1;

            while (num < 0) {
                System.out.println("Informe o " + ( i + 1 ) + "º númeo");
                num = Integer.parseInt(sc.nextLine());

                if(num < 0) {
                    System.out.println("Número inválido");
                    break;
                }

                if(num > maior) {
                    maior = num;
                } else if (num < menor){
                    menor = num;
                }

                soma += num;
            }

        }
        media = soma / 20;

        System.out.println("O menor número foi " + menor);
        System.out.println("O maior número foi " + maior);
        System.out.println("A média foi " + media);

    }
}
