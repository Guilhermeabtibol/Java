package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do Dolar: ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Digite o valor em dolares: ");
        double amountInDolares = sc.nextDouble();

        double totalEmReais = CurrencyConverter.convertParaReais(cotacaoDolar, amountInDolares);

        System.out.printf("Valor total em reais (COM IOF): %.2f%n", totalEmReais);

        sc.close();
    }
}
