package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        estudante.name = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.printf("Nota Final = %.2f%n", estudante.finalGrade() );

        if (estudante.finalGrade() < 60.0) {
            System.out.println("Não Passou");
            System.out.printf("Faltaram %.2f Pontos%n", estudante.quantosPontosFaltam());
        } else {
            System.out.println("Passou");
        }
        sc.close();
    }
}
