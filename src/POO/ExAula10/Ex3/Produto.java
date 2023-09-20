package POO.ExAula10.Ex3;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void getProdutoFromEstoque (int quant) {
        if((this.quantidadeEmEstoque - quant) < 0) {
            System.out.println("Impossível retirar mais produtos do que existem");
        } else {
            this.quantidadeEmEstoque -= quant;

        }
    }
}
