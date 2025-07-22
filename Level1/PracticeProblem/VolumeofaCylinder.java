package PracticeProblem;
import java.util.*;
public class VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Radius = sc.nextInt();
        double Height = sc.nextInt();
        double Volume;
        double pi = 3.14;
        Volume = pi * (Radius * Radius) * Height;
        System.out.print(Volume);
    }
}
