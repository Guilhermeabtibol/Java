package application;

import util.Calculador;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    //palavra final diz que o tal é constante e nao pode ser mudado e todas as letras sao maiusculas

    public static void main(String[] args) {
        //nao podemos chamar uma funcao nao estatica para dentro de uma funcao estatica sendo que o compilador n vai deixar rodar
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculador calc = new Calculador();

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", calc.PI);
        sc.close();
    }

}
