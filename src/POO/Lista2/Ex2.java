package POO.Lista2;

public class Ex2 {
    public static void main(String[] args) {
        int count = 0, sum = 0;


        while (count < 100) {
            if(count % 2 == 0 ) {
                sum += count;

            }
            count++;
        }

        System.out.println("A soma é " + sum);
    }
}
