import Client.*;
public class Main {
    public static void main(String[] args) {
        ClientHand ready = new Ready();
        ClientHand wait = new Waiting();

        Client.getInstance().setHand(wait);
        Client.getInstance().handUp();

        Client.getInstance().setHand(ready);
        Client.getInstance().handUp();
    }
}