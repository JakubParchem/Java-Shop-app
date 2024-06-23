import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\n" +
                "\n" +
                "       __                     _____ __                                   \n" +
                "      / /___ __   ______ _   / ___// /_  ____  ____     ____ _____  ____ \n" +
                " __  / / __ `/ | / / __ `/   \\__ \\/ __ \\/ __ \\/ __ \\   / __ `/ __ \\/ __ \\\n" +
                "/ /_/ / /_/ /| |/ / /_/ /   ___/ / / / / /_/ / /_/ /  / /_/ / /_/ / /_/ /\n" +
                "\\____/\\__,_/ |___/\\__,_/   /____/_/ /_/\\____/ .___/   \\__,_/ .___/ .___/ \n" +
                "                                           /_/            /_/   /_/      \n" +
                "\n");
        Storage storage=new Storage();
        Basket basket =new Basket();
        basket.display();
        storage.Storage_Menagment();

    }
}