package POO.Construtor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> prod = new ArrayList<>();

        Produto produto = new Produto();

        produto.setCodigo(123);
        produto.setNome("teste");

        prod.add(produto);

        produto = new Produto();

        produto.setCodigo(456);
        produto.setNome("segundo");

        prod.add(produto);

        System.out.println(prod.get(0).getNome());
        System.out.println(prod.get(1).getNome());

    }
}
