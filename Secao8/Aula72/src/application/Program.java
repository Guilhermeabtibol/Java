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
        //Nesse metodo, eu nao preciso mais criar o objeto "calc" pq ele ja é um valor estatico
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculador.circunferencia(raio);

        double v = Calculador.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", Calculador.PI); // essa constante tambem é estatica
        sc.close();
    }

}
