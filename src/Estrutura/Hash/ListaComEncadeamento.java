package Estrutura.Hash;

public class ListaComEncadeamento<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo;
    private int contador;

    public ListaComEncadeamento() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }
    public boolean add(Aluno aluno) {
        Estrutura.Listas.NoLista no = new Estrutura.Listas.NoLista(aluno, null);

        if (primeiro == null) {
            this.primeiro = no;

        } else {
            this.ultimo.setNext(no);

        }
        this.ultimo = no;
        this.contador++;
        return true;
    }
}
