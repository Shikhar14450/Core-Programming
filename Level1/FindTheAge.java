package Level1;
import java.util.*;
public class FindTheAge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Year You Are Born:");
        int Year=sc.nextInt();
        System.out.print("Right Now Year:");
        int RightNow=sc.nextInt();
            int Age=RightNow-Year;
            System.out.print("Harry's age in 2024 is "+Age);
    }
}
