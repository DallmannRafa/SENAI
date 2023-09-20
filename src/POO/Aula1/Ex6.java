package POO.Aula1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade");
        idade = Integer.parseInt(sc.nextLine());

        if(idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
