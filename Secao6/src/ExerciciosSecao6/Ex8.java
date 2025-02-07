package ExerciciosSecao6;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a entrada: ");
        int N = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
        sc.close();
    }
}
