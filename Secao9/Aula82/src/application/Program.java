package application;

import entities.Account;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account conta;

        System.out.print("Digite o Numero da Conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o Nome do Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Deseja Fazer Depósito Inicial(y/n)? ");
        char resposta = sc.next().charAt(0); //forma de ler o caracter

        if (resposta == 'y' || resposta == 'Y') {
            System.out.print("Digite o Valor de Deposito Inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Account(numero, titular, depositoInicial);
        } else {
            conta = new Account(numero, titular);
        }
        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o Valor para Deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Conta Atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o Valor para Saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Conta Atualizada: ");
        System.out.println(conta);


        sc.close();
    }
}
