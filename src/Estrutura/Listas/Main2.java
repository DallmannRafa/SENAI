package Estrutura.Listas;

public class Main2 {
    public static void main(String[] args) {
        ListaComEncadeamento list = new ListaComEncadeamento();

        list.add(23);//0
        list.add(21);//1
        list.add(24);//2
        list.add(21);//3

        System.out.println(list.indexOf(24));
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.set(2, 400);
        System.out.println(list.get(2));

        System.out.println("first = " + list.indexOf(22));
        System.out.println("last = " + list.lastIndexOf(22));

        System.out.println("\n");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " >> " + list.get(i));
        }

        System.out.println("first = " + list.first.getInfo());
        System.out.println("last = " + list.last.getInfo());

        list.add(0, 233);

        System.out.println("\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " >> " + list.get(i));
        }

        System.out.println("first = " + list.first.getInfo());
        System.out.println("last = " + list.last.getInfo());

        System.out.println(list.toString());
    }
}
