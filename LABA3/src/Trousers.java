public abstract class Trousers extends Clother implements ManClother,WomanClother{
    Size size;
    double price;
    Color color;

    public Trousers(Size s, double p, Color c){
        super(s,p,c);
    }

}
