package POO.Presenca;

import POO.Presenca.Produto;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Utilizando os conceitos de encapsulamento, crie um programa para
 * cadastro de produtos e gerenciamento de estoque.
 * O programa deve seguir as seguintes regras:
 * ok  -> Permitir que o usuário cadastre o nome, a descrição, o valor
 *      e a quantidade de itens do produto em estoque.
 * ok  -> Não deve permitir que o usuário informe valores negativos para
 *   	o campo referente ao valor do produto.
 * ok  -> Não deve permitir que seja cadastrado um valor negativo para a
 *   	quantidade em estoque.
 * ok  -> Não deve permitir que sejam cadastrados produtos duplicados
 *   	(com o mesmo nome).
 * ok  -> Deve solicitar as informações de um produto até que o usuário
 *   	informe valores válidos.
 * ok  -> Deve cadastrar 20 produtos.
 * ok  -> Deve apresentar o cálculo do valor total de todos os produtos;
 * ok  -> Deve apresentar o valor médio dos produtos cadastrados;
 * ok  -> Deve apresentar a quantidade total de produtos em estoque;
 * ok  -> Deve apresentar os produtos que possuem quantidade em estoque
 *   	menor ou igual a 5.
 * ok  -> Deve apresentar o valor total dos produtos que estão com
 *   	estoque menor ou igual a 5;
 */

public class Estoque {

    static final int NumElementos = 20;
    static ArrayList<Produto> Produtos = new ArrayList<>(NumElementos);
    static double ValorTotalProdutos;
    static double QuantidadeTotalProdutos;
    static int ValorTotalProdutosEstoqueMenor;

    public static void main(String[] args)
    {
        Scanner Leitor  = new Scanner(System.in);
        Boolean RefazLoop;

        for ( int i = 0; i < NumElementos; i++ )
        {
            Produto novoProduto = new Produto();

            RefazLoop = true;
            while (RefazLoop)
            {
                System.out.println("Informe o nome do produto: ");
                RefazLoop = !novoProduto.setNome(Leitor.nextLine());
                if (ProdutoComNomeRepetido(i, novoProduto.getNome()))
                {
                    System.out.println("Já existe um produto com este nome!");
                    RefazLoop = true;
                }
            }

            System.out.println("Informe a descrição do produto: ");
            novoProduto.setDescricao(Leitor.nextLine());

            RefazLoop = true;
            while (RefazLoop)
            {
                System.out.println("Informe o valor do produto: ");
                RefazLoop = !novoProduto.setValor(Leitor.nextDouble());
                Leitor.nextLine();
            }

            RefazLoop = true;
            while (RefazLoop)
            {
                System.out.println("Informe a quantidade do produto em estoque: ");
                RefazLoop = !novoProduto.setQuantidade(Leitor.nextInt());
                Leitor.nextLine();
            }
            Produtos.add(novoProduto);
        }

        RealizarCalculos();
        System.out.println("O valor total dos produtos é: " + ValorTotalProdutos);
        System.out.println("O valor médio dos produtos é: " + (ValorTotalProdutos / QuantidadeTotalProdutos));
        System.out.println("A quantidade total de produtos é de: " + QuantidadeTotalProdutos + " unidades");
        System.out.println("Relação de produtos com quantidade menor ou igual a 5 unidades:");
        ListaProdutosMenorIgualA5();
        System.out.println("O valor total dos produtos com estoque <= 5 é: " + ValorTotalProdutosEstoqueMenor);

        Leitor.close();
    }

    static private Boolean ProdutoComNomeRepetido(int ProdutoAtual, String nome)
    {
        Boolean NomeRepetido = false;

        for (int i = 0; i < ProdutoAtual; i++) {

            if (Produtos.get(i).getNome().equals(nome)) {
                NomeRepetido = true;
                break;
            }
        }

        return NomeRepetido;
    }

    static private void RealizarCalculos(){
        QuantidadeTotalProdutos = 0;
        ValorTotalProdutos = 0;

        for ( int i = 0; i < NumElementos; i++ )
        {
            ValorTotalProdutos += (Produtos.get(i).getQuantidade() * Produtos.get(i).getValor());
            QuantidadeTotalProdutos += Produtos.get(i).getQuantidade();
        }
    }

    static private void ListaProdutosMenorIgualA5()
    {
        ValorTotalProdutosEstoqueMenor = 0;

        for ( int i = 0; i < NumElementos; i++ )
            if (Produtos.get(i).getQuantidade() <= 5)
            {
                System.out.println("  -> " + Produtos.get(i).getNome() + " Qtde: " + Produtos.get(i).getQuantidade());
                ValorTotalProdutosEstoqueMenor += (Produtos.get(i).getQuantidade() * Produtos.get(i).getValor());
            }
    }
}
