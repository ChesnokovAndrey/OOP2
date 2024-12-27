package Client;

public class Client {
    public static Client client;
    private Client(){}

    public static Client getInstance(){
        if(client == null) client = new Client();
        else return client;
    }
    public void handUp(boolean flag){

        if(flag) System.out.println("Я хочу сделать заказ");
        else System.out.println("Я ещё выбираю");
    }
}
