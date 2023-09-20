package Estrutura.Listas;

import java.util.Objects;

public class ListaComArray {

    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int count;
    private final static int x = 10;

    public ListaComArray() {
        this.array = new Integer[x];
        this.resizable = false;
        this.count = 0;
        this.initialCapacity = x;
    }

    public ListaComArray(boolean resizable) {
        this.array = new Integer[x];
        this.resizable = resizable;
        this.count = 0;
        this.initialCapacity = x;
    }

    public Integer get(int index) {
        if (index >= 0 && index < count) {
            return this.array[index];

        }
        return null;

    }

    public Integer set (int index, Integer value) {
        if (index >= 0 && index < count) {
            Integer oldValue = this.array[index];
            this.array[index] = value;
            return oldValue;

        }
        return null;

    }
    
    public boolean contains (Integer value) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.array[i], value)) {
                return true;

            }
        }
        return false;

    }

    public int indexOf (Integer value) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.array[i], value)) {
                return i;

            }
        }
        return -1;
    }

    public int lastIndexOf (Integer value) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.array[i], value)) {
                index = i;

            }
        }

        return index;
    }

    public boolean add (Integer obj) {
        if (count <= array.length) {
            array[count] = obj;
            count++;
            return true;

        } else if (resizable){
            resizeArrayList();
            array[count] = obj;
            count++;
            return true;

        } else {
            return false;

        }
    }

    public boolean add (int index, Integer obj) {
        if (index >= 0 && index < count) {
            if (count >= this.array.length && resizable) {
                resizeArrayList();

            } else if (count > array.length){
                return false;

            }

            int loops = count - index;

            for (int i = 0; i < loops; i++) {
                this.array[count - i] = this.array[count - i - 1];

            }

            this.array[index] = obj;
            count++;
            return true;

        } else {
            return false;
        }
    }

    public Integer remove(int index) {
        if (index >= 0 && index < count) {
            Integer num = this.array[index];

            stepBackward(index);
            count--;
            return num;

        } else {
            return null;

        }
    }

    public boolean removeFirst(Integer value) {
        for (int i = 0; i < this.array.length; i++) {
            if(Objects.equals(this.array[i], value)){
                stepBackward(i);
                count--;
                return true;

            }
        }
        return false;

    }

    private void stepBackward(int index) {
        for (int i = index; i < count; i++) {
            this.array[i] = this.array[i + 1];

        }
    }

    private void resizeArrayList() {
        Integer[] newArray = new Integer[this.array.length + x];

        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;

    }

    public String toString (){
        String arrayTxt = "| ";

        for (int i = 0; i < count; i++) {
            arrayTxt += this.array[i] + " | ";

        }
        return arrayTxt;
    }

    public Integer[] toArray() {
        Integer[] newArray = new Integer[count];

        for (int i = 0; i < count; i++) {
            newArray[i] = this.array[i];
        }

        return newArray;
    }

    public boolean isEmpty (){
        return count == 0;

    }

    public boolean isFull () {
        if(resizable){
            return (this.count == this.array.length);

        } else {
            return false;

        }
    }

    public int size(){
        return count;

    }

    public void clear(){
        this.array = new Integer[initialCapacity];
        count = 0;

    }




}
