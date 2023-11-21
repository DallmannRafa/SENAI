package Estrutura.Arvore;

public class NoArvoreBinaria {

    private Integer info;
    private NoArvoreBinaria right;
    private NoArvoreBinaria left;

    public NoArvoreBinaria(Integer info) {
        this(info, null, null);
    }

    public NoArvoreBinaria(Integer info, NoArvoreBinaria right, NoArvoreBinaria left) {
        this.info = info;
        this.right = right;
        this.left = left;
    }


}
