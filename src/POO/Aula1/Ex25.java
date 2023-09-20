package POO.Aula1;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe o número");
        num = Integer.parseInt(sc.nextLine());

        System.out.println(Integer.toBinaryString(num));
    }
}
