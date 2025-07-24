package Level1;
import java.util.*;
public class Distribution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("NoOfPens:");
        int NoOfPens=sc.nextInt();
        System.out.print("NoOfStudents");
        int NoOfStudents=sc.nextInt();
        int Divide=NoOfPens/NoOfStudents;
        int Remaining=NoOfPens%NoOfStudents;
        System.out.println("The Pen Per Student is "+Divide+" and the remaining pen not distributed is "+Remaining);
        System.out.println(Remaining);
    }
}
