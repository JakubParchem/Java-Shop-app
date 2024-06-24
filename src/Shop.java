public class Shop {
    Storage storage;
    Basket basket=new Basket();
    public Shop(Storage storage){
        this.storage=storage;
    }
    public void shopping(){
        storage.display(false);

    }

}
