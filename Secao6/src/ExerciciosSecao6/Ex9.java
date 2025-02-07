package ExerciciosSecao6;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int div;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ) {
                System.out.println(i);
            }
        }
    }
}
