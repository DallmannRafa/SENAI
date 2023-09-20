package Estrutura.Lista2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double celsius, fahren;

        System.out.println("Qual a tempertura em ºC");
        celsius = Double.parseDouble(sc.nextLine());

        fahren = celsius * 1.8 + 32;

        System.out.println("Isso equivale a " + fahren + "F");

    }
}
