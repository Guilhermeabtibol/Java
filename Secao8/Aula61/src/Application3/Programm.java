package Application3;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Digite os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();


        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.println();
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);
        System.out.println();

        if (areaX > areaY) {
            System.out.println("A maior area é X: ");
        } else {
            System.out.println("A maior area é Y");
        }
        sc.close();

    }

}
