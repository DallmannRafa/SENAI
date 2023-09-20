package POO.Prova1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto[] products = new Produto[20];

        double valorTotal = 0, valorMedio;
        int totalValorProdutosCriticos = 0, quantTotalProdutos = 0;

        for (int i = 0; i < products.length; i++) {

            products[i] = new Produto();
            boolean verifica = false;
            String nome = "";

            System.out.println("\n    >>>>>Cadastro do " + (i + 1) + "º produto<<<<<\n");

            while (!verifica) {
                System.out.print("Informe o nome do produto:");

                nome = sc.nextLine();

                verifica = true;

                for (int j = 0; j < i; j++) {

                    if (products[j].getNome().equals(nome)) {
                        System.out.println("!! Nome inválido (duplicado) !!");
                        verifica = false;
                    }
                }
            }

            products[i].setNome(nome);

            System.out.print("Informe a descrição do produto:");
            products[i].setDesc(sc.nextLine());

            verifica = false;

            while (!verifica) {
                System.out.print("Informe a quantidade em estoque do produto:");
                verifica = products[i].setEstoque(Integer.parseInt(sc.nextLine()));

                if (!verifica) {
                    System.out.println("!! Quantidade inválida !!");
                }
            }

            verifica = false;

            while (!verifica) {
                System.out.print("Informe o valor do produto:");
                verifica = products[i].setValor(Double.parseDouble(sc.nextLine()));

                if (!verifica) {
                    System.out.println("!! Valor inválido !!");
                }
            }

            valorTotal += (products[i].getValor() * products[i].getEstoque());
            quantTotalProdutos += products[i].getEstoque();
        }

        valorMedio = valorTotal / quantTotalProdutos;

        System.out.println("\n    >>>>>Fim do Cadastro<<<<<\n");
        System.out.println("    >>>>>Relatório<<<<<\n");

        System.out.println("O valor total dos produtos em estoque é de R$" + valorTotal);
        System.out.println("O valor medio dos produtos em estoque é de R$" + valorMedio);
        System.out.println("A quantidade total de produtos em estoque é de " + quantTotalProdutos);

        System.out.println("Os produtos críticos, que possuem estoque menor ou igual a 5 são:");
        for (int i = 0; i < products.length; i++) {
            if (products[i].getEstoque() <= 5) {
                System.out.println("    > " + products[i].getNome());
                totalValorProdutosCriticos += (products[i].getValor() * products[i].getEstoque());
            }
        }

        System.out.println("O valor total dos produtos críticos em estoque é de R$" + totalValorProdutosCriticos);
    }
}
