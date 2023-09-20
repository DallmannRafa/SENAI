package Estrutura.Listas;

public class NoLista {
    private Integer info;
    private NoLista next;

    public NoLista() {
        this.info = null;
        this.next = null;
    }
    public NoLista(Integer info, NoLista next) {
        this.info = info;
        this.next = next;
    }

    public void setNext(NoLista no) {
        this.next = no;
    }

    public NoLista getNext() {
        return next;
    }


    public Integer getInfo() {
        return this.info;
    }




}
