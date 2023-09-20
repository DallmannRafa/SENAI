package Estrutura.Entrega1;

import java.io.*;

public class ExArquivos {
    public static void main(String[] args) throws IOException {

        File arq1 = new File("C:\\Users\\rafael_h\\Documents\\arq1.txt");
        File arq2 = new File("C:\\Users\\rafael_h\\Documents\\arq2.txt");

        WriterAppend(arq1, arq2);
        WriterNoAppend(arq1, arq2);

        ReaderArq1(arq1);
        ReaderArq2(arq2);
    }

    public static void WriterNoAppend(File arq1, File arq2) throws IOException {
        String line;

        FileReader fileReader = new FileReader(arq1);
        BufferedReader fileReaderBuffered = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(arq2, false);
        BufferedWriter fileWriterBuffered = new BufferedWriter(fileWriter);

        while ((line = fileReaderBuffered.readLine()) != null) {
            fileWriterBuffered.write(line);
            fileWriterBuffered.newLine();
        }

        fileWriterBuffered.close();
        fileReaderBuffered.close();
    }

    public static void WriterAppend(File arq1, File arq2) throws IOException {
        FileReader fileReader = new FileReader(arq1);
        BufferedReader fileReaderBuffered = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(arq2, true);
        BufferedWriter fileWriterBuffered = new BufferedWriter(fileWriter);

        String line;

        while ((line = fileReaderBuffered.readLine()) != null) {
            fileWriterBuffered.write(line);
            fileWriterBuffered.newLine();
        }

        fileWriterBuffered.close();
        fileReaderBuffered.close();
    }


    public static void ReaderArq1(File arq) throws IOException {

        String line;

        FileReader fileReader = new FileReader(arq);
        BufferedReader fileReaderBuffered = new BufferedReader(fileReader);

        while ((line = fileReaderBuffered.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void ReaderArq2(File arq) throws IOException {

        String line;

        FileReader fileReader = new FileReader(arq);
        BufferedReader fileReaderBuffered = new BufferedReader(fileReader);

        while ((line = fileReaderBuffered.readLine()) != null) {
            System.out.println(line);
        }
    }
}