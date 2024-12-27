package Client;

public class Client implements ClientHand{
    public static Client client;
    private Client(){}
    private ClientHand hand;
    public static Client getInstance(){
        if(client == null) { client = new Client(); }
        return client;
    }

    public ClientHand getHand() {
        return hand;
    }

    public void setHand(ClientHand hand) {
        this.hand = hand;
    }

    @Override
    public void handUp() {
        this.hand.handUp();
    }
}
