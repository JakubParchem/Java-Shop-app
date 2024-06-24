
public class Basket extends Product_list{
    @Override
    public void display(boolean show_amount) {
        System.out.println("Basket:\n\n");
        super.display(show_amount);
        System.out.println("\n----------------\nTotal price: "+totalprice());
    }
    public double totalprice(){
        double total=0.0;
        for(Product p:products){
            total+=p.amount*p.price;
        }
        return total;
    }
    public void BasketManagment(){
        while(true){
            display(false);
            System.out.println("\n0 - proceed to payment\n 1 - return to shoping\n\nwhat do you want to do: ");
            switch (input.nextInt()){
                case 0:{
                    System.out.println("Bought: \n------------\n");
                    super.display(true);
                    System.out.println("For "+totalprice()+"zł \n Thank You for Shopping with Us!");
                    System.exit(1);
                }
                case 1:{
            }
        }
    }
}
