package Estrutura.Prova1;

import java.io.*;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException{

        File arq1 = new File("C:\\Users\\rafael_h\\Documents\\arq1.txt");

        Scanner sc = new Scanner(System.in);

        int option = 0;
        double valorA, valorB;
        String line;

        while (option != 5) {
            System.out.println("Escolha uma opção");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Divisão");
            System.out.println("[4] Multiplicação");
            System.out.println("[5] Sair");
            option = Integer.parseInt(sc.nextLine());

            if (option != 5) {
                if (option < 1 || option > 5) {
                    System.out.println("Opção inválida");
                } else {

                    System.out.println("Informe o primeiro valor");
                    valorA = Double.parseDouble(sc.nextLine());

                    System.out.println("Informe o segundo valor");
                    valorB = Double.parseDouble(sc.nextLine());

                    line = log(valorA, valorB, option);

                    System.out.println(line);
                    writerAppend(arq1, line);

                }
            }
        }
    }
    public static String log (double numA, double numB, int operator) {

        double resultado;
        String line;

        switch (operator) {
            case 1:
                resultado = numA + numB;
                line = numA + " + " + numB + " = " + resultado;
                return line;
            case 2:
                resultado = numA - numB;
                line = numA + " - " + numB + " = " + resultado;
                return line;
            case 3:
                resultado = numA / numB;
                line = numA + " / " + numB + " = " + resultado;
                return line;
            case 4:
                resultado = numA * numB;
                line = numA + " * " + numB + " = " + resultado;
                return line;
            default:
                return "";
        }
    }

    public static void writerAppend(File arq1, String line) throws IOException {

        FileWriter fileWriter = new FileWriter(arq1, true);
        BufferedWriter fileWriterBuffered = new BufferedWriter(fileWriter);

        fileWriterBuffered.write(line);
        fileWriterBuffered.newLine();

        fileWriterBuffered.close();
    }
}

