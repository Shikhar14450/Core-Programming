package SelfProblem;
import java.util.*;
public class PerimeterofaRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Perimeter;
        int length=sc.nextInt();
        int width=sc.nextInt();
        Perimeter = 2 * (length + width);
        System.out.print(Perimeter);
    }
}
