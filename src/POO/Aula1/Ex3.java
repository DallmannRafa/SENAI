package POO.Aula1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media;

        System.out.println("Informe a primeira nota");
        media = Double.parseDouble(sc.nextLine());
        System.out.println("Informe a segunda nota");
        media += Double.parseDouble(sc.nextLine());
        System.out.println("Informe a terceira nota");
        media += Double.parseDouble(sc.nextLine());

        System.out.println(media/3);

    }
}
