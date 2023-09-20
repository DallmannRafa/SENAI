package POO.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterDog {
    public static void main(String[] args) {
        int cont = 5;
        ArrayList<Dog> dog= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cont; i++) {
            Dog dogs = new Dog();
            System.out.println("Informe o nome do cachorro (" + (i + 1) + "/" + cont + ")");
            dogs.setName(sc.nextLine());
            System.out.println("Informe a idade do cachorro (" + (i + 1) + "/" + cont + ")");
            dogs.setAge(Integer.parseInt(sc.nextLine()));
            dog.add(dogs);
        }

        System.out.println("Os cachorros que foram cadastrados foram ...");
        for (int i = 0; i < dog.size(); i++) {
            Dog dogs = dog.get(i);
            System.out.println(dogs.getName()+", "+dogs.getAge());
        }
    }
}
