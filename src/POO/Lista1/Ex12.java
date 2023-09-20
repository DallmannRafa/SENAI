package POO.Lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Informe o número");
        numero = Integer.parseInt(sc.nextLine());

        if(numero % 3 == 0 && numero % 5 == 0){
            System.out.println("O número é multiplo de 3 e de 5");
        } else {
            System.out.println("O número não é multiplo");
        }
    }
}
