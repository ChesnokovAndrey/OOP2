public class Main {
    public static void main(String[] args) {
        Phone user1 = new Phone("9583754831", "Nokia 3310", "0.1");
        Phone user2 = new Phone("9654543672","Iphone Galaxy C90 Ultra Pro Maxim");
        Phone user3 = new Phone();
        System.out.println(user1.getNumber() + " " + user1.getModel() + " " + user1.getWeight());
        user1.receiveCall("Бабуля", "97544339854");
        user1.sendMessage("9876543210", "9546382432", "9514347835");
    }
}