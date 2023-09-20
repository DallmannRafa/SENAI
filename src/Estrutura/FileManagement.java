package Estrutura;

import java.io.File;

public class FileManagement {
    public static void main(String[] args) {
        File meuArquivo = new File("C:\\Users\\rafael_h\\Documents\\teste.txt");
        if (meuArquivo.exists()) {
            System.out.println(
                    "Dados do arquivo " +
                            meuArquivo.getAbsolutePath()
            );
            System.out.println(
                    "Tamanho " +
                            meuArquivo.length() + " bytes");
            System.out.println(
                    "Pode ser escrito? " +
                            meuArquivo.canWrite());
        } else {
            meuArquivo.mkdir();
        }
    }
}
