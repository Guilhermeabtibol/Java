package ExerciciosSecao6;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0 ) {
                System.out.println("Divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
