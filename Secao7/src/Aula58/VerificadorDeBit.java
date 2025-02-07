package Aula58;

import java.util.Scanner;

public class VerificadorDeBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; //O 0b indica q vai vir um numero binario
        int n = sc.nextInt();

        if ((n & mask) != 0) { // se n e a mask for diferente de zero, o sexto bit é verdadeiro
            System.out.println("6º bit é verdadeiro"); // o sexto bit é o 1 da mas variavel mask
        } else {
            System.out.println("6º bit é falso");
        }
        sc.close();
    }
}
