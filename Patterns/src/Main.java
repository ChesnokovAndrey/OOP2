import Client.Client;

public class Main {
    public static void main(String[] args) {
        Client.getInstance().handUp(true);
        System.out.println("Hello world!");
    }
}