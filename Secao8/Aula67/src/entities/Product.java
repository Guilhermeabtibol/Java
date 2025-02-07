package entities;

public class Product {
    public String name;
    public int quantity;
    public Double price;

    public double valorTotalNoEstoque() {
        return quantity * price;
    }

    public void adicionarProdutos(int quantity) {
        this.quantity += quantity;
    }

    public void removerProdutos(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " +
                String.format("%.2f", valorTotalNoEstoque());
    }
}
