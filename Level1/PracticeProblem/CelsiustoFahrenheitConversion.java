package PracticeProblem;
import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Cel=sc.nextInt();
        int Fah;
        Fah=(Cel*9/5)+32;
        System.out.print(Fah);
    }
}
