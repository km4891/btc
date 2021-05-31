import java.util.*;

public class App {
    
    public static class Getlive {
        
       
            Random r = new Random();
            int low = 40000;
            int high = 65000;
            int coin = r.nextInt(high - low) + low;
        
        int getcoin() {
        return coin;
    }
}
    
    public static void main(String[] args) throws Exception {
        Getlive getLive1 = new Getlive();
        System.out.println(getLive1.coin);
    }
}
