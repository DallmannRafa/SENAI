package POO.Aula1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual sua idade?");
        idade = Integer.parseInt(sc.nextLine());

        if(idade >= 65) {
            System.out.println(nome + ", você pode se aposentar");
        } else {
            System.out.println(nome + ", você não pode se aposentar");
        }
    }
}
