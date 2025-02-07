package entities;
public class Product {
    private String name;
    public double price;
    public int quantity;

    //o construtor recebe esses parametros pq ele puxa oq é necessario
    //this = uma referencia para o proprio objeto
    // ele é usado para diferenciar
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // vamos criar uma sobrecarga
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price ) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}