package POO.Aula1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe o numero");
        num = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder(Integer.toString(num));

        if(sb.toString().equals(sb.reverse().toString())) {
            System.out.println("É palindomo");
        } else {
            System.out.println("Não é palindromo");
        }
    }
}
