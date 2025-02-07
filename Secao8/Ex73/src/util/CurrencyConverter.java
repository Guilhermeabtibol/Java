package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convertParaReais(double dolarCota, double amountInDolares) {
        double grossAmount = dolarCota * amountInDolares;
        return grossAmount + grossAmount * IOF;
    }
}
