package ExerciciosSecao6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            System.out.print("Digite o valor y: ");
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

        }
        sc.close();
    }
}