package Estrutura.Lista3;

public class TesteMetodo {
    public static void main(String[] args) {

        mostrarMensagem(2);
        System.out.println(somaDeInteiros(26, 5));

    }

    public static void mostrarMensagem(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Passei por aqui");
        }
    }

    public static int somaDeInteiros(int a, int b) {
        return a + b;
    }
}
