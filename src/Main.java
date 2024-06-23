import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Storage storage=new Storage();
        storage.display();
        storage.edit_product(0);
        storage.display();
    }
}