package POO.ExAula10.Ex1;

import POO.ExAula10.Ex1.Aluno;

public class AppAluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setNome("Rafa");
        a1.setNota1(7.8);
        a1.setNota2(8.5);
        a1.setNota3(9.3);

        System.out.println(a1.calculaMedia());

    }
}
