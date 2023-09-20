package Estrutura.Lista3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe o valor");
        num = Integer.parseInt(sc.nextLine());

        System.out.println(RecursiveSum(num));

    }

    public static int RecursiveSum(int quant) {
        int sum = quant;

        if (quant != 0) {
            sum += RecursiveSum(quant - 1);
            return sum;
        } else {
            return 0;
        }

    }
}
