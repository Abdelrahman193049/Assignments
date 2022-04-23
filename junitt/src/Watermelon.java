import java.util.Scanner;
public class Watermelon {
    public boolean weight(int w){
        if ( w <= 0)
            throw new IllegalArgumentException("weight must be positive integer");
        if (w % 2==0 && w != 2)
            return true;
        else
            return false;
    }
}