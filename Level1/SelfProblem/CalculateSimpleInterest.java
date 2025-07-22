package SelfProblem;
import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Principal=sc.nextInt();
        double Rate=sc.nextInt();
        double Time=sc.nextInt();
        double SimpleInterest;
        SimpleInterest=Principal*Rate*Time/100;
        System.out.print(SimpleInterest);
    }
}
