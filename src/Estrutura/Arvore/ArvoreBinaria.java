package Estrutura.Arvore;

public class ArvoreBinaria {

    private NoArvoreBinaria root;

    public ArvoreBinaria() {
        root = null;
    }

    public String toString() {
        return "meumetodo";
    }

    public NoArvoreBinaria insere (Integer v, NoArvoreBinaria left, NoArvoreBinaria right) {
        NoArvoreBinaria no = new NoArvoreBinaria(v, right, left);
        this.root = no;
        return no;

    }
}
