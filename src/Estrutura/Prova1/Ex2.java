package Estrutura.Prova1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] celaBraille = new int[3][2];

        System.out.println("Informe o padrão para a cela Braille");
        System.out.println("O padrão é o seguinte:");
        System.out.println("[1][4]");
        System.out.println("[2][5]");
        System.out.println("[3][6]");

        int count = 0, quantPontosElevados = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Informe o " + (count + 1) + "º valor (sendo 0 ou 1)");
                celaBraille[j][i] = Integer.parseInt(sc.nextLine());

                if (celaBraille[j][i] == 1) {
                    quantPontosElevados++;
                }
                count++;
            }
        }

        System.out.println("Foram informados " + quantPontosElevados + " pontos elevados");

        if (    celaBraille[0][0] == 1 && celaBraille[0][1] == 0 &&
                celaBraille[1][0] == 0 && celaBraille[1][1] == 0 &&
                celaBraille[2][0] == 0 && celaBraille[2][1] == 0) {
            System.out.println("A cela Braille representa a letra 'a'");
        } else {
            System.out.println("A cela Braille não representa a letra 'a'");
        }
    }
}
