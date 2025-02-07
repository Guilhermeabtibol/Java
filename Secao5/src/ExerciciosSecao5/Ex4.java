package ExerciciosSecao5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaInicial - horaFinal;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " Hora(s)");
    }
}
