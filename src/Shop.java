import java.io.IOException;
import java.util.Scanner;

public class Shop {
    Storage storage;
    Scanner input=new Scanner(System.in);
    Basket basket=new Basket();
    public Shop(Storage storage){
        this.storage=storage;
    }
    public void shopping() throws IOException {
        int id;
        int a;
        while (true){
            storage.display(false);
            System.out.print("0 - add to basket\n1 - Go to basket\n2 - exit\nwhat do you want to do: ");
            switch (input.nextInt()){
                case 0:{
                    System.out.print("which product [id] : ");
                    id=input.nextInt();
                    while (true){
                        System.out.print("how many (max "+storage.getProduct(id).amount+") : ");
                        a=input.nextInt();
                        if(a>0 && a<=storage.getProduct(id).amount){
                            basket.addProduct(new Product(storage.getProduct(id),a));
                            storage.products.get(id).amount-=a;
                            break;
                        }
                        else {
                            System.out.println("must by >0 and <="+storage.getProduct(id).amount);
                        }
                    }
                    break;
                }
                case 1:{
                    
                }
                case 2:{

                }
                default:{
                    System.out.println("wrong input");
                    break;
                }
            }
        }
    }

}
