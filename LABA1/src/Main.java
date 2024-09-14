public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 301; i++){
            if(i % 6 != 0 && i % 4 == 0){
                int d,s = 1, ans = i;
                while(i > 0){
                    d = i % 10;
                    s += d;
                    i /= 10;
                }
                if (s < 10) System.out.println(ans);
            }
        }
    }
}