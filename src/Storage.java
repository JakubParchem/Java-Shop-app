import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage extends Product_list{
    Scanner input=new Scanner(System.in);
    public Storage() throws IOException {
        File f=new File("src/storage.txt");
        Scanner reader=new Scanner(f);
        while(reader.hasNextLine()){
            addProduct(new Product(reader.next()));
        }
    }
    @Override
    public void addProduct(Product p) throws IOException {
        super.addProduct(p);
        save();
    }
    @Override
    public void removeproduct(int i) throws IOException {
        super.removeproduct(i);
        save();
    }
    public void edit_product(int i) throws IOException {
        while (true){
            System.out.println("Editing :"+products.get(i));
            System.out.print("0 - price\n 1 - name\nwhich do you want to edit : ");
            switch (input.nextInt()){
                case 0:{
                    System.out.print("\nenter new price: ");
                    products.get(i).updatePrice(input.nextDouble());
                    save();
                    return;
                }
                case 1:{
                    System.out.print("\nEnter new name: ");
                    input.nextLine();
                    products.get(i).changeName(input.nextLine());
                    save();
                    return;
                }
                default:{
                    System.out.println("wrong input");
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
    public void Storage_Menagment() throws IOException {
        int i=0;
        String s="";
        while(true){
            display();
            System.out.println("------------------------\nStorage Menagment\n\n0 - edit\n1 - add\n2 - remove\n3 - exit\n");
            System.out.print("what do you want to do: ");
            switch (input.nextInt()){
                case 0:{
                    while (true){
                        display();
                        System.out.print("------------------------\nwhich product do you want to edit[id] : ");
                        i=input.nextInt();
                        if(i>=0 && i< products.size()){
                            edit_product(i);
                            break;
                        }
                        else {
                            System.out.println("wrong input");
                        }
                    }
                    break;
                }
                case 1:{
                    System.out.print("input name: ");
                    input.nextLine();
                    s=input.nextLine();
                    System.out.print("input price: ");
                    addProduct(new Product(s,input.nextDouble()));
                    break;
                }
                case 2:{
                    while (true){
                        display();
                        System.out.print("------------------------\nwhich product do you want to delete[id] : ");
                        i=input.nextInt();
                        if(i>=0 && i< products.size()){
                            removeproduct(i);
                            break;
                        }
                        else {
                            System.out.println("wrong input");
                        }
                    }
                    break;
                }
                case 3:{
                    return;
                }
                default:{
                    System.out.println("wrong input");
                    break;
                }
            }
        }
    }
}
