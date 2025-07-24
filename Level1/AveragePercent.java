package Level1;
import java.util.*;
public class AveragePercent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Maths Marks:");
        int Maths=sc.nextInt();
        System.out.print("Physics Marks:");
        int Physics=sc.nextInt();
        System.out.print("Chemistry:");
        int Chemistry=sc.nextInt();
        int Average=(Maths+Physics+Chemistry)/3;
        System.out.println("Sam’s average mark in PCM is "+Average);
    }
}


