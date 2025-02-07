package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Digite a largura do retangulo: ");
        rect.width = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        rect.height = sc.nextDouble();


        System.out.printf("Area = %.2f%n", rect.area());
        System.out.printf("Perimetro = %.2f%n", rect.perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());
    }
}
