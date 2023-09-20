package Estrutura.Lista1;
//Faça um programa que preencha um vetor com 5 números e exiba o vetor na ordem inversa.
public class Ex1 {
    public static void main(String[] args) {
        int[] vet = new int[5];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i * 2;
        }

        for (int i = 0; i < vet.length ; i++) {
            System.out.println(vet[(vet.length - 1) - i]);
        }
    }
}
