package Level1;
import java.util.*;
public class Handshakes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int NumberOfStudents=sc.nextInt();
        int Combination=(NumberOfStudents*(NumberOfStudents-1))/2;
        System.out.println(Combination);
    }
}
