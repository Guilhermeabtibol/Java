package ExerciciosSecao6;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
