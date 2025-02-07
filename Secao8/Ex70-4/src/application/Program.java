package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();
        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Primeira nota: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.1f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 7.0) {
            System.out.printf("Aluno: %s nao Passou", estudante.nome);
            System.out.println();
            System.out.printf("Faltaram: %.1f Pontos para passar", estudante.pontosParaPassar());
        } else {
            System.out.println("Passou");
        }
        sc.close();


    }
}
