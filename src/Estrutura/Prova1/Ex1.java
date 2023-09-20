package Estrutura.Prova1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vendasDiarias = new double[7];

        double mediaValores, menorValor = 0, maiorValor = 0, somaValores = 0;
        int diaMaiorValor = 0, diaMenorValor = 0;

        for (int i = 0; i < vendasDiarias.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º dia");
            vendasDiarias[i] = Double.parseDouble(sc.nextLine());

            somaValores += vendasDiarias[i];

            if (vendasDiarias[i] > maiorValor || i == 0) {
                maiorValor = vendasDiarias[i];
                diaMaiorValor = i + 1;
            }
            if (vendasDiarias[i] < menorValor || i == 0) {
                menorValor = vendasDiarias[i];
                diaMenorValor = i + 1;
            }

        }

        mediaValores = somaValores / vendasDiarias.length;

        System.out.println("A média do valor de vendas diário é de R$" + mediaValores);
        System.out.println("O dia com maior valor de venda diário foi o " + diaMaiorValor + "º com o valor de R$" + maiorValor);
        System.out.println("O dia com menor valor de venda diário foi o " + diaMenorValor + "º com o valor de R$" + menorValor);
        System.out.println("O total de vendas do período foi de R$" + somaValores);

    }
}
