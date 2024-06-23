import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product_list {
    protected ArrayList<Product> products=new ArrayList<Product>();
    Scanner input=new Scanner(System.in);
    public void display(boolean show_amount){
        if(show_amount){
            for (int i = 0; i <products.size() ; i++){
                System.out.println("[ "+i+" ]  "+ products.get(i)+"    amount: "+ products.get(i).amount);
            }
        }
        else{
            for (int i = 0; i <products.size() ; i++){
                System.out.println("[ "+i+" ]  "+ products.get(i));
            }
        }
    }
    public void addProduct(Product p) throws IOException {
        products.add(p);
    }
    public void removeproduct(int i) throws IOException {
        products.remove(i);
    }
    public Product getProduct(int i){
        return products.get(i);
    }
}
