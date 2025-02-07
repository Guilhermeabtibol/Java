package application;

import entitites.Employee;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario(a): " + emp);
        System.out.println();
        System.out.print("Qual a porcentagem incrementada no salario? ");
        System.out.println();
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Atualizado: " + emp);
        sc.close();
    }
}
