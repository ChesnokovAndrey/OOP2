public abstract class Shirt extends Clother implements ManClother, WomanClother {
    Size size;
    double price;
    Color color;

    public Shirt(Size s, double p, Color c){
        super(s,p,c);
    }
}
