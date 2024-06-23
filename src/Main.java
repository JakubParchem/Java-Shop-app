public class Main {
    public static void main(String[] args) {
        Product prod=new Product("jajko",0.5);
        System.out.println(prod);
        Storage storage=new Storage();
        storage.addProduct(prod);
        storage.addProduct(new Product("zupa",10.09));
        storage.display();
        storage.edit_product(0);
        storage.display();
        storage.removeproduct(0);
        storage.display();
    }
}