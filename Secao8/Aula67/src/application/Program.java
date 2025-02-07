package application;

import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.print("Product data: "+ product);

        System.out.println();
        System.out.printf("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.adicionarProdutos(quantity);

        System.out.println();
        System.out.print("Update data: "+ product);

        System.out.println();
        System.out.printf("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removerProdutos(quantity);

        System.out.println();
        System.out.print("Update data: "+ product);




        sc.close();
    }
}
