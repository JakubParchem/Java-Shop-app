import java.io.IOException;
import java.util.Scanner;

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
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("\n0 - Shop\n1 - Storage Menagment\n2 - exit");
            System.out.print("what do you want to do : ");
            switch (input.nextInt()){
                case 0:{
                    storage.display(false);
                    break;
                }
                case 1:{
                    storage.Storage_Menagment();
                    break;
                }
                case 2:{
                    System.out.println("\n" +
                            "\n" +
                            "   _____              __  __               __          __            __\n" +
                            "  / ___/___  ___      \\ \\/ /___  __  __   / /   ____ _/ /____  _____/ /\n" +
                            "  \\__ \\/ _ \\/ _ \\      \\  / __ \\/ / / /  / /   / __ `/ __/ _ \\/ ___/ / \n" +
                            " ___/ /  __/  __/      / / /_/ / /_/ /  / /___/ /_/ / /_/  __/ /  /_/  \n" +
                            "/____/\\___/\\___/      /_/\\____/\\__,_/  /_____/\\__,_/\\__/\\___/_/  (_)   \n" +
                            "                                                                       \n" +
                            "\n");
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