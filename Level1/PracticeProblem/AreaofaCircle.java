package PracticeProblem;
import java.util.*;
public class AreaofaCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Radius=sc.nextInt();
        double Area;
        double pi=3.14;
        Area= pi*(Radius*Radius);
        System.out.print(Area);
    }
}
