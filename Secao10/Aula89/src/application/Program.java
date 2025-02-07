package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        // e é assim que percorremos um vetor heheheheheheheh
        //usando for
        for (int i = 0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0.0;

        for (int i =0; i<n; i++) {
            soma += vect[i];
            // o for vai acumular no vetor e depois ver a soma
        }

        double avg = soma / n;
        System.out.printf("A media de altura é: %.2f%n", avg);
        sc.close();
    }
}
