package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];
        /* oa inves de usar n para determinar o numero de vetores, podemos apenas usaro vect.length
        * e é melhor usar ela pq nao precisamos depender de uma declaracao de n */
        for (int i = 0; i < n; i++) {
            sc.nextLine(); //para nao deixar pendente por conta do nexInt
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i< n ;  i++)  {
            sum += vect[i].getPrice(); // para pegar so o preco e somo todo mundo
        }

        double avg = sum / n;

        System.out.printf("O preço médio é: %.2f%n", avg);

        sc.close();
    }
}
