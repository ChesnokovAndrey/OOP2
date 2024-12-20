public class Phone {
    String number;
    String model;
    String weight;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getWeight() {
        return weight;
    }
    public Phone(String n, String m, String w){
        number = n;
        model = m;
        weight = w;
    }
    public Phone(String n, String m){
        number = n;
        model = m;
    }
    public Phone(){}
    public void receiveCall(String name, String num){
        System.out.println("Звонит "+ name + " " + num);
    }

    public void sendMessage(String... num) {
        System.out.println("Сообщение было передано следующим номерам:");
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
