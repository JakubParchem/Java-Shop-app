public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String s){
        String[] S=s.split(",");
        this.name=S[0];
        this.price=Double.parseDouble(S[1]);
    }
    @Override
    public String toString() {
        return name + "    cena: " + price+" zł";
    }
    public String display(){
        return name+","+price;
    }
    public void updatePrice(double nprice){
        price=nprice;
    }
    public void changeName(String nname){
        name=nname;
    }
}