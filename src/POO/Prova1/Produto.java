package POO.Prova1;

public class Produto {

    private String nome;
    private String desc;
    private double valor;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public boolean setValor(double valor) {

        if (valor < 0) {
            return false;
        } else {
            this.valor = valor;
            return true;
        }

    }

    public int getEstoque() {
        return estoque;
    }

    public boolean setEstoque(int estoque) {

        if (estoque < 0) {
            return false;
        } else {
            this.estoque = estoque;
            return true;
        }

    }
}
