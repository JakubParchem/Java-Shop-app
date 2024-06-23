import java.util.ArrayList;
import java.util.Scanner;

public class Storage{
    private ArrayList<Product> products=new ArrayList<Product>();
    Scanner input=new Scanner(System.in);
    public void display(){
        for (int i = 0; i <products.size() ; i++){
            System.out.println("[ "+i+" ]  "+ products.get(i));
        }
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public void removeproduct(int i){
        products.remove(i);
    }
    public void edit_product(int i){
        while (true){
            System.out.println("Editing :"+products.get(i));
            System.out.print("[0 : price, 1 : name] :  ");
            switch (input.nextInt()){
                case 0:{
                    System.out.print("enter new price: ");
                    products.get(i).updatePrice(input.nextDouble());
                    return;
                }
                case 1:{
                    System.out.print("Enter new name: ");
                    products.get(i).changeName(input.next());
                    return;
                }
            }
        }
    }
}
