package Estrutura.Prova2;

import Estrutura.Prova2.NoLista;

public class ListaComEncadeamento {

    public NoLista first;
    public NoLista last;
    private int count;

    public ListaComEncadeamento() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public boolean addFirst(Integer value) {
        NoLista no = new NoLista(value, null);

        if (this.first != null) {
            no.setNext(this.first);
            this.first = no;

        } else {
            this.first = no;
            this.last = no;
        }

        this.count++;
        return true;
    }

    public boolean addLast(Integer value) {
        NoLista no = new NoLista(value, null);

        if (this.last != null) {
            this.last.setNext(no);
            this.last = no;

        } else {
            this.first = no;
            this.last = no;
        }

        this.count++;
        return true;
    }

    public int size() {
        return this.count;
    }

    public void clear() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        NoLista atual = first;

        sb.append("[ ");

        while (atual != null) {
            sb.append(atual.getInfo());

            if (atual.getNext() != null) {
                sb.append(", ");
            }
            atual = atual.getNext();

        }

        sb.append(" ]");

        return sb.toString();
    }

    public Integer get(int index) {

        if (index >= 0 && index < count) {
            NoLista tmp = this.first;

            for (int i = 0; i < index; i++) {
                tmp = tmp.getNext();
            }

            return tmp.getInfo();
        } else {
            return null;
        }

    }

    public boolean removeAll(Integer value) {

        if (isEmpty()) {
            return false;
        }

        NoLista curr = this.first;
        NoLista prev = null;
        int removed = 0;

        while (curr != null) {

            if (curr.getInfo().equals(value)) {
                if (prev == null) {
                    this.first = curr.getNext();
                } else {
                    prev.setNext(curr.getNext());
                }

                if (curr == this.last) {
                    this.last = prev;
                }
                curr = curr.getNext();
                count--;
                removed++;

            } else {
                prev = curr;
                curr = curr.getNext();

            }
        }

        return removed > 0;
    }

    public void reverse() {

        if (isEmpty() || this.first == this.last) {
            return;
        }

        NoLista curr = this.first;
        NoLista prev = null;
        NoLista nextNo;

        while (curr != null) {
            nextNo = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextNo;

        }
        NoLista aux = this.first;
        this.first = this.last;
        this.last = aux;

    }
    public boolean isEmpty() {
        return this.first == null;

    }

}
