package Estrutura.Lista3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operation;
        double a, b;

        System.out.println("Qual a operação");
        operation = Integer.parseInt(sc.nextLine());

        System.out.println("Qual o primeiro valor");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Qual o segundo valor");
        b = Double.parseDouble(sc.nextLine());

        System.out.println(Calc(a, b, operation));

    }

    public static Double Calc(Double a, Double b, int operation) {
        switch (operation) {
            case 1:
                return a + b;

            case 2:
                return a - b;

            case 3:
                return a / b;

            case 4:
                return a * b;

            default:
                System.out.println("Operação inexistente");
                return null;
        }
    }
}
