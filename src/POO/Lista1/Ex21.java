package POO.Lista1;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        int maior = 0, medio = 0, menor = 0;

        System.out.println("Informe o 1º número");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Informe o 2º número");
        num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Informe o 3º número");
        num3 = Integer.parseInt(sc.nextLine());

        if (num1 > num2 && num1 > num3) {

            maior = num1;
            if (num2 > num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {

            maior = num2;
            if (num1 > num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else if (num3 > num2 && num3 > num1) {

            maior = num3;
            if (num2 > num1) {
                medio = num2;
                menor = num1;
            } else {
                medio = num1;
                menor = num2;
            }
        }

        System.out.println(maior);
        System.out.println(medio);
        System.out.println(menor);

    }
}
