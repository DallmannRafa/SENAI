package Estrutura.Entrega1;

import java.util.Scanner;

public class ExPrimitivos01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, high;

        System.out.println("Informe a base");
        base = Integer.parseInt(sc.nextLine());
        System.out.println("Informe a altura");
        high = Integer.parseInt(sc.nextLine());

        System.out.println("A área do retângulo é de " + (base * high) + "cm²");
    }
}
