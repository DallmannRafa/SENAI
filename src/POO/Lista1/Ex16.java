package POO.Lista1;

import java.util.Scanner;


public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe o número");
        num = Integer.parseInt(sc.nextLine());

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i ++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}
