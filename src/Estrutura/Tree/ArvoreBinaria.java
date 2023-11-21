package Estrutura.Tree;

public class ArvoreBinaria {

    private int h;
    private Integer array[];

    public ArvoreBinaria(int h) {
        this.h = h;
        this.array = new Integer[getQtNodes()];
    }

    public int getQtNodes(){
        return (int) Math.pow(2, this.h + 1) - 1;
    }
}
