package POO.Lista2;

public class Ex8 {
    public static void main(String[] args) {
        int count = 0, sum = 0;

        for (int i = 0; i < 100; i++) {
            if(count % 2 == 0 ) {
                sum += count;

            }
            count++;
        }

        System.out.println("A soma é " + sum);
    }
}
