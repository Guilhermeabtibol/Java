package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

//FAZENDO UMA PROPROSTA DE MELHORIA
public class Program {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter product data: ");
    System.out.print("Name: ");

    String name = sc.nextLine();
    System.out.print("Price: ");
    Double price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    int quantity = sc.nextInt();
    Product product = new Product(name, price, quantity); // COm isso, eu estou obrigando o programador a informar os dados bem na instanciacao dele


    System.out.println();
    System.out.println("Product data: " + product);
    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");

    quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);
    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);
    sc.close();
}
}