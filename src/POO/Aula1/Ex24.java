package POO.Aula1;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String num;

        System.out.println("Informe o número");
        num = sc.nextLine();

        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(sum);
    }
}
