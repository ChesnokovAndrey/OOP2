package Client;

public class Ready implements ClientHand{
    @Override
    public void handUp() {
        System.out.println("Я хочу сделать заказ");
    }
}
