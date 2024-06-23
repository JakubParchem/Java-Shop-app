import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Storage storage=new Storage();
        Basket basket =new Basket();
        basket.addProduct(new Product("zupa",5.5));
        basket.display();
        storage.Storage_Menagment();

    }
}