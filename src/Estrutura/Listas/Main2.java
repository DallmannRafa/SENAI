package Estrutura.Listas;

public class Main2 {
    public static void main(String[] args) {
        ListaComEncadeament list = new ListaComEncadeament();

        list.add(23);
        list.add(21);
        list.add(24);

        System.out.println(list.contains(22));
    }
}
