package Estrutura.Hash;

public class NoLista<T> {
    private T informacao;
    private NoLista<T> proximo;

    public NoLista() {
        this(null, null);
    }

    public NoLista(T informacao, NoLista<T> proximo) {
        this.informacao = informacao;
        this.proximo = proximo;
    }

    public T getInformacao() {
        return informacao;
    }

    public void setInformacao(T informacao) {
        this.informacao = informacao;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
