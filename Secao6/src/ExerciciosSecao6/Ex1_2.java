package ExerciciosSecao6;


import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;
        do {
            System.out.print("Digite a Senha: ");
            senha = sc.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);

        System.out.println("Acesso Permitido");
        sc.close();
    }
}