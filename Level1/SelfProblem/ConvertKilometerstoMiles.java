package SelfProblem;
import java.util.*;
public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Kilometers = sc.nextInt();
        double Miles = Kilometers * 0.621371;
        System.out.print(Miles);
    }
}
