package POO.Aula1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 2, num2 = 4, num3 = 5;

        if(num1 + num2 <= num3 || num2 + num3 <= num1 || num3 + num1 <= num2) {
            System.out.println("Não é possível formar um triângulo");
        } else {
            System.out.println("É possível formar um triângulo");
        }
    }
}
