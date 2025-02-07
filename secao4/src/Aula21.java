import java.util.Scanner;

public class Aula21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        sc.close();

        /*para ler um numero:
        inteiro: sc.nextInt();
        double: sc.nexDouble();
        float: sc.next

        PARA COLOCAR O PONTO:
        Locale.setDefault(Locale.US);
        CTRL + SHIFT + F para identar o codigo bonitinho
        */
    }
}
