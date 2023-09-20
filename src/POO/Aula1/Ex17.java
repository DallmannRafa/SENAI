package POO.Aula1;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra;

        System.out.println("Informe uma letra");
        letra = sc.nextLine();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("É uma vogal");
        } else {
            System.out.println("Não é vogal");
        }
    }
}
