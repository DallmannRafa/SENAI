package POO.E_Commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente fulano = new Cliente("Fulano de Tal", "994568561", "Rua dos fulano, 66");

        Compra compra = new Compra(fulano);

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();

        produto1.nome = "Coca-cola";
        produto1.valor = 5.50;
        produto1.categoria = "Bebidas";

        Produto produto2 = new Produto();

        produto2.nome = "Pepsi";
        produto2.valor = 5.00;
        produto2.categoria = "Bebidas";

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Qual produto você deseja?");

        int option = -1;

        while (option != 0) {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(">>Item " + (i + 1));
                System.out.println(produtos.get(i).nome);
                System.out.println("Valor R$" + produtos.get(i).valor);
                System.out.println();

            }

            System.out.println("Para adicionar, digite o número do item, para saír digite 0");
            option = Integer.parseInt(sc.nextLine());

            if (option != 0) {
                compra.AddProduct(produtos.get(option - 1));
            }
        }

        System.out.println("Lista de compras:");

        Double valorTotal = 0.00;

        for (int i = 0; i < compra.listaProduto.size(); i++) {
            System.out.println(">>Produto " + (i + 1));
            System.out.println(compra.listaProduto.get(i).nome);
            System.out.println("Valor R$" + compra.listaProduto.get(i).valor);
            System.out.println();

            valorTotal += compra.listaProduto.get(i).valor;

        }

        System.out.println("O valor total da compra é de R$" + valorTotal);

    }

}
