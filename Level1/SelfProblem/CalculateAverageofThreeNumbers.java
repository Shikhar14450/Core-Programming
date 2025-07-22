package SelfProblem;
import java.util.*;
public class CalculateAverageofThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int Average=(x+y+z)/3;
        System.out.print(Average);
    }
}
