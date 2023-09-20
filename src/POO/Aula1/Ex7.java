package POO.Aula1;

public class Ex7 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 4;

        if(num1 > num2 && num1 > num3) {
            System.out.println("O maior número é " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("O maior número é " + num2);
        } else if(num3 > num1 && num3 > num2) {
            System.out.println("O maior número é " + num2);
        }
    }
}
