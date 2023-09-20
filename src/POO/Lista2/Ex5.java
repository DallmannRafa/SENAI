package POO.Lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 1;

        while (option != 4) {
            System.out.println("1 - Sacar\n2 - Depositar\n3 - Verificar Saldo\n4 - Sair");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    System.out.println("você escolheu a opção Sacar");
                    break;
                case 2:
                    System.out.println("você escolheu a opção Depositar");
                    break;
                case 3:
                    System.out.println("você escolheu a opção Verifica Saldo");
                    break;
                case 4:
                    System.out.println("Finalizando");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }

    }
}
