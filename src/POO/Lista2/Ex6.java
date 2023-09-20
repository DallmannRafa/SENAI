package POO.Lista2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, num, smallest;

        System.out.println("Informe um número");
        smallest = Integer.parseInt(sc.nextLine());

        while (count < 9) {
            System.out.println("Informe um número");
            num = Integer.parseInt(sc.nextLine());

            if(num < smallest) {
                smallest = num;
            }

            count++;
        }

        System.out.println(smallest);
    }
}
