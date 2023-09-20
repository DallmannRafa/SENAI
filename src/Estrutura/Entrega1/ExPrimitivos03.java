package Estrutura.Entrega1;

import java.util.Scanner;

public class ExPrimitivos03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double peso, altura, IMC;

        System.out.println("Qual seu peso?");
        peso = Double.parseDouble(sc.nextLine());

        System.out.println("Qual sua altura em m?");
        altura = Double.parseDouble(sc.nextLine());

        IMC = peso / (altura * altura);

        System.out.println("Seu IMC é de " + IMC);
    }
}
