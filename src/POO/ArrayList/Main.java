package POO.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        System.out.printf("A lista contem "+nomes.size()+" itens");

        nomes.add("Jeferson Caminhoes");
        System.out.printf("A lista contem "+nomes.size()+ " itens");
        nomes.add("Maria");
        nomes.add("Fernanda");
        nomes.add("Daiane");
        System.out.printf("A lista contem "+nomes.size()+ " itens");
        System.out.print(nomes);
    }
}
