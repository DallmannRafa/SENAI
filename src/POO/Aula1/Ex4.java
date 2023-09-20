package POO.Aula1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número");
        numero = Integer.parseInt(sc.nextLine());

        if(numero%2 == 0){
            System.out.println("O número informado é par");
        } else {
            System.out.println("O número informado é ímpar");
        }
    }
}
