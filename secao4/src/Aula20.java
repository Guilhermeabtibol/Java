import java.util.Locale;

public class Aula20 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Office desk";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F'; //sempre colocar em aspas simples como em c

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos: ");
        System.out.printf("%s, o preço é:  $ %.2f%n", produto1, preco1); //esse printf parece o de c, entao da pra usar q nem o de c
        System.out.println();
        System.out.printf("%s, o preço é: $ %.2f%n ", produto2, preco2); // olha ai oh ma
        System.out.println();
        System.out.printf("A idadee é: %d anos de idade, codigo %d e genero %c%n", idade, codigo, genero);
        System.out.println();
        System.out.printf("Esse tal de measure e oito decimal lugares: %.8f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("tipo decimal do us com ponto: %.3f%n", measure);

        //APRENDE ISSO AI
    }
}
