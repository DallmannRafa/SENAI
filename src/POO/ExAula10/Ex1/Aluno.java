package POO.ExAula10.Ex1;

public class Aluno {

    private String nome;
    private double nota1, nota2, nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(this.verificaNota(nota1)) {
            this.nota1 = nota1;
        }

    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(this.verificaNota(nota2)) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if(this.verificaNota(nota2)) {
            this.nota2 = nota2;
        }
    }

    private boolean verificaNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            return true;
        } else {
            System.out.println("Nota inválida");
            return false;
        }
    }

    public double calculaMedia () {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
