package ExerciciosSecao6;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;
        boolean acessoPermitido = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

            if (senha == 2002) {
                acessoPermitido = true;
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        if (acessoPermitido) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Numero de tentativas excedido");
        }
        sc.close();
    }
}
