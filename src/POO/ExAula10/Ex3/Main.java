package POO.ExAula10.Ex3;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Coca");
        p1.setQuantidadeEmEstoque(200);

        p1.getProdutoFromEstoque(300);
    }
}
