package POO.Lista1;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sal;

        System.out.println("Informe o salário");
        sal = Integer.parseInt(sc.nextLine());

        if(sal <= 1500) {
            sal *= 1.15;
        } else {
            sal *= 1.10;
        }

        System.out.println(sal);
    }
}
