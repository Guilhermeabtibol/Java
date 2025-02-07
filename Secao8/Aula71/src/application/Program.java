package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    //palavra final diz que o tal é constante e nao pode ser mudado e todas as letras sao maiusculas
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        //nao podemos chamar uma funcao nao estatica para dentro de uma funcao estatica sendo que o compilador n vai deixar rodar
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", PI);
        sc.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
