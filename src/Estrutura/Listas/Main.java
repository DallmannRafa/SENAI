package Estrutura.Listas;

public class Main {
    public static void main(String[] args) {
        ListaComArray array = new ListaComArray(true);

        System.out.println("\n----TEST - Is empty/ Is full----");
        System.out.println("Empty = " + array.isEmpty());
        System.out.println("Full = " + array.isFull());

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(5);
        array.add(6);

        array.add(1, 300);
        System.out.println("\n----TEST - Add in index----");
        System.out.print(array.toString());
        System.out.println("   >> Size:" + array.size());

        System.out.println("\n----TEST - Is empty/ Is full----");
        System.out.println("Empty = " + array.isEmpty());
        System.out.println("Full = " + array.isFull());

        System.out.println("\n----TEST - clear----");
        array.clear();
        System.out.print(array.toString());
        System.out.println("   >> Size:" + array.size());

        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(5);
        array.add(6);

        System.out.println("\n----TEST - remove (index 3)----");
        System.out.println("After  = " + array.toString());
        System.out.println(array.remove(3));;
        System.out.println("Before = " + array.toString());

        System.out.println("\n----TEST - removeFirst (value 5)----");
        System.out.println("After  = " + array.toString());
        System.out.println(array.removeFirst(5));;
        System.out.println("Before = " + array.toString());

        System.out.println("\n----TEST - get (index 4)----");
        System.out.println(array.toString());
        System.out.println(array.get(4));;

        System.out.println("\n----TEST - set (index 2)----");
        System.out.println("After  = " + array.toString());
        System.out.println(array.set(2, 33));
        System.out.println("Before = " + array.toString());

        System.out.println("\n----TEST - contains (value 33 e 23)----");
        System.out.println(array.contains(33));
        System.out.println(array.contains(23));

        System.out.println("\n----TEST - indexOf (value 5)----");
        System.out.println(array.toString());
        System.out.println(array.indexOf(5));

        System.out.println("\n----TEST - lastIndexOf (value 5)----");
        array.add(5);
        array.add(6);
        array.add(4);
        //array.add(5);
        System.out.println(array);
        System.out.println(array.lastIndexOf(5));

        System.out.println("\n----TEST - toArray----");
        System.out.println(array.toString());

        Integer[] test = new Integer[array.size()];
        test = array.toArray();

        for (int i = 0; i < test.length; i++) {
            System.out.print(" , " + test[i]);
        }


    }
}
