package Estrutura.Hash;

public class TabelaHash<T> {

    private ListaComEncadeamento<T> array[];
    private int contador;

    public TabelaHash() {
        this(13);
    }

    public TabelaHash(int tamanho) {

        array = (ListaComEncadeamento<T>[]) new Object[tamanho];

        for (int i = 0; i < array.length; i++) {
            array[i] = new ListaComEncadeamento<T>();
        }
    }

    private int hash(int chave) {
        return (chave % array.length);
    }

    public void insere(Aluno aluno) {
        int h = hash(aluno.getMatricula());

        array[h].add(null);
    }
}
