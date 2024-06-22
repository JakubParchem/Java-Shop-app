public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return name + "    cena: " + price+" zł/szt";
    }
    public void updatePrice(double nprice){
        price=nprice;
    }
    public void changeName(String nname){
        name=nname;
    }
}