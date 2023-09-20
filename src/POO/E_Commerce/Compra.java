package POO.E_Commerce;

import java.util.*;

public class Compra {

    public ArrayList<Produto> listaProduto;
    public Cliente cliente;

    public Compra(Cliente cliente) {
        this.listaProduto = new ArrayList<>();
        this.cliente = cliente;
    }

    public void AddProduct (Produto produto) {
        this.listaProduto.add(produto);
    }


}
