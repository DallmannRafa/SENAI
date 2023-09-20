package Estrutura.Listas;

public class ListaComEncadeament {
    private NoLista first;
    private NoLista last;
    private int count;

    public ListaComEncadeament() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public boolean add(Integer value) {
        NoLista no = new NoLista(value, null);

        if (first == null) {
            this.first = no;

        } else {
            this.last.setNext(no);

        }
        this.last = no;
        this.count++;
        return true;
    }

    public boolean contains(Integer value) {
        NoLista tmp = this.first;

        while (value != tmp.getInfo() && tmp.getNext() != null) {
            tmp = tmp.getNext();

        }

        if (value == tmp.getInfo()) {
            return true;
        }

        return false;
    }

    public int indexOf(Integer info) {
        NoLista tmp = this.first;
        int index = -1;

        while (info != tmp.getInfo()) {

        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }
    public int size() {
        return this.count;
    }
    public void clear() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }


}
