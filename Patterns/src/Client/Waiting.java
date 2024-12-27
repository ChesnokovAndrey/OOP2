package Client;

public class Waiting implements ClientHand{
    @Override
    public void handUp() {
        System.out.println("Я ещё выбираю");
    }
}
