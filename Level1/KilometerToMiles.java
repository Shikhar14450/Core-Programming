package Level1;
import java.util.*;
public class KilometerToMiles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Kilometers:");
        double Kilometers=sc.nextInt();
        double Miles=Kilometers+0.6;
        System.out.println("The distance "+Kilometers + " km in miles is "+Miles);
    }
}


