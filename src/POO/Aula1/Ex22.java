package POO.Aula1;

public class Ex22 {
    public static void main(String[] args) {
        char test = 'D';

        if (test >= 'a' && test <= 'z') {
            System.out.println("É minusculo");
        } else if (test >= 'A' && test <= 'Z') {
            System.out.println("É maiúsculo");
        } else if (test >= '0' && test <= '9') {
            System.out.println("É número");
        }

    }
}
