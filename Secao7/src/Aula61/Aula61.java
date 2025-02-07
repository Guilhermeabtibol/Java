package Aula61; // Define o pacote onde a classe Aula61 está localizada

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Aula61 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declara três variáveis inteiras para armazenar os números
        int a, b, c;

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro numero: ");
        a = sc.nextInt(); // Lê o primeiro número e armazena em 'a'

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo numero: ");
        b = sc.nextInt(); // Lê o segundo número e armazena em 'b'

        // Solicita ao usuário que digite o terceiro número
        System.out.print("Digite o terceiro numero: ");
        c = sc.nextInt(); // Lê o terceiro número e armazena em 'c'

        // Chama o método max para encontrar o maior número entre a, b e c
        int higher = max(a, b, c);

        // Chama o método showResult para exibir o maior número encontrado
        showResult(higher);

        // Fecha o objeto Scanner para liberar os recursos
        sc.close();
    }

    // Método que recebe três inteiros e retorna o maior deles
    public static int max(int a, int b, int c) {
        int aux; // Variável auxiliar para armazenar o maior número

        // Verifica se 'a' é maior que 'b' e 'c'
        if (a > b && a > c) {
            aux = a; // Se verdadeiro, 'a' é o maior
        }
        // Verifica se 'b' é maior que 'c'
        else if (b > c) {
            aux = b; // Se verdadeiro, 'b' é o maior
        }
        // Se nenhuma das condições anteriores for verdadeira, 'c' é o maior
        else {
            aux = c; // 'c' é o maior
        }

        // Retorna o maior número encontrado
        return aux;
    }

    // Método que exibe o maior número encontrado
    public static void showResult(int higher) {
        // Exibe o resultado na tela
        System.out.println("O maior é: " + higher);
    }
}