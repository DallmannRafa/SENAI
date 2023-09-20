package POO.Lista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        Double altura, peso, imc;

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual sua altura?");
        altura = Double.parseDouble(sc.nextLine());

        System.out.println("Qual seu peso?");
        peso = Double.parseDouble(sc.nextLine());

        imc = peso / (altura * altura);

        System.out.println(nome + ", seu IMC é: " + imc);
    }
}
