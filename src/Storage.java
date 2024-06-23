import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage{
    private ArrayList<Product> products=new ArrayList<Product>();
    Scanner input=new Scanner(System.in);
    public Storage() throws IOException {
        File f=new File("src/storage.txt");
        Scanner reader=new Scanner(f);
        while(reader.hasNextLine()){
            addProduct(new Product(reader.next()));
        }
    }
    public void display(){
        for (int i = 0; i <products.size() ; i++){
            System.out.println("[ "+i+" ]  "+ products.get(i));
        }
    }
    public void addProduct(Product p) throws IOException {
        products.add(p);
        save();
    }
    public void removeproduct(int i) throws IOException {
        products.remove(i);
        save();
    }
    public void edit_product(int i) throws IOException {
        while (true){
            System.out.println("Editing :"+products.get(i));
            System.out.print("[0 : price, 1 : name] :  ");
            switch (input.nextInt()){
                case 0:{
                    System.out.print("enter new price: ");
                    products.get(i).updatePrice(input.nextDouble());
                    save();
                    return;
                }
                case 1:{
                    System.out.print("Enter new name: ");
                    products.get(i).changeName(input.next());
                    save();
                    return;
                }
            }
        }
    }
    public void save() throws IOException {
        FileWriter writer=new FileWriter("src/storage.txt");
        for (int i = 0; i <products.size() ; i++){
            if (i== products.size()-1){
                writer.write(products.get(i).display());
            }
            else {
                writer.write(products.get(i).display() + "\n");
            }
        }
        writer.close();
    }
}
