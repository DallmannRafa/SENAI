package Estrutura.Listas;

public class ListaComEncadeamento {
    public NoLista first;
    public NoLista last;
    private int count;

    public ListaComEncadeamento() {
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

    public boolean add(int index, Integer info) {

        if (index >= 0 && index <= count ) {
            NoLista no = new NoLista(info, getNo(index));

            if (index > 0) {
                getNo(index - 1).setNext(no);
            } else if(index == 0) {
                this.first = no;
            }

            if(index == count) {
                this.last = no;
            }

            count++;
            return true;
        } else {
            return false;
        }

    }

    public Integer remove(int index) {
        if (index >= 0 && index < count) {
            Integer info = getNo(index).getInfo();

            if (count == 1) {
                this.first = null;
                this.last = null;

            } else if (index == 0) {
                this.first.setNext(null);
                this.first = getNo(index + 1);

            } else if (index == count - 1) {
                this.last = getNo(index -1);
                this.last.setNext(null);

            } else {
                getNo(index - 1).setNext(getNo(index + 1));
                getNo(index).setNext(null);
            }

            count--;
            return info;
        } else {
            return null;
        }
    }

    public boolean removeFirst(Integer info) {
        if (indexOf(info) != -1) {
            this.remove(this.indexOf(info));
            return true;
        }

        return false;

    }

    public Integer get(int index) {

        NoLista tmp = getNo(index);

        if (tmp != null) {

            return tmp.getInfo();
        } else {
            return null;
        }

    }

    public NoLista getNo(int index) {
        if (index >= 0 && index < count) {
            NoLista tmp = this.first;

            for (int i = 0; i < index; i++) {
                tmp = tmp.getNext();
            }

            return tmp;
        } else {
            return null;
        }

    }

    public Integer set (int index, Integer info) {

        if(index >= 0 && index < count) {

            Integer olderInfo = getNo(index).getInfo();
            getNo(index).setInfo(info);

            return olderInfo;

        }

        return null;

    }

    public boolean contains(Integer value) {

        if (this.indexOf(value) == -1) {
            return false;
        } else {
            return true;
        }

    }

    public int indexOf(Integer info) {
        NoLista tmp = this.first;
        int index = 0;

        while (info != tmp.getInfo() && tmp.getNext() != null) {
            tmp = tmp.getNext();
            index++;
        }

        if (info == tmp.getInfo()) {
            return index;
        }

        return -1;
    }

    public int lastIndexOf(Integer info) {
        NoLista tmp = this.first;
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (tmp.getInfo() == info) {
                index = i;
            }

            tmp = tmp.getNext();
        }

        return index;
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

    public Integer[] toArray() {
        Integer[] array = new Integer[count];
        NoLista tmp = this.first;

        for (int i = 0; i < count; i++) {
            array[i] = tmp.getInfo();
            tmp = tmp.getNext();
        }

        return array;
    }

    public String toString() {
        String list = "";
        NoLista tmp = this.first;

        for (int i = 0; i < count; i++) {
            list += tmp.getInfo() + " - ";
            tmp = tmp.getNext();
        }

        return list;
    }



}
