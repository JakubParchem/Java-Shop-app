public class Product {
    protected String name;
    protected double price;
    public int amount;

    public Product(String name, double price , int amount) {
        this.name = name;
        this.price = price;
        this.amount=amount;
    }
    public Product(String s){
        String[] S=s.split(",");
        this.name=S[0];
        this.price=Double.parseDouble(S[1]);
        this.amount=Integer.parseInt(S[2]);
    }
    public Product(Product p,int amount){
        this.name= p.name;
        this.price=p.price;
        this.amount=amount;
    }
    @Override
    public String toString() {
        return name + "    price: " + price+" zł";
    }
    public String display(){
        return name+","+price+","+amount;
    }
    public void updatePrice(double nprice){
        price=nprice;
    }
    public void changeName(String nname){
        name=nname;
    }
}