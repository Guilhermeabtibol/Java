package entities;

public class Account {
    private int numero;
    private String titular; // titular
    private double saldo; //saldo

    public Account(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public Account(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getNumber() {
        return numero;
    }


    public String getHolder() {
        return titular;
    }

    public void setHolder(String holder) {
        this.titular = holder;
    }

    public Double getBalance() {
        return saldo;
    }

    public void deposito(double amount ) {
        saldo += amount;
    }

    public void saque(double amount) {
        saldo -= amount + 5.0;
    }

    public String toString() {
        return "Conta "
                + numero
                + ", Titular da Conta: "
                + titular
                + ", Saldo da Conta: $ "
                + String.format("%.2f", saldo);
    }

}
