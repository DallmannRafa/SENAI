package POO.Lista2;

public class Ex9 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0 ) {
                sum += i;

            }

        }

        System.out.println("A soma é " + sum);
    }
}
