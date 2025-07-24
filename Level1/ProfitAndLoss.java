package Level1;
import java.util.*;
public class ProfitAndLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Cost_Price:");
        int Cost_Price=sc.nextInt();
        System.out.print("Sell_Price:");
        int Sell_Price=sc.nextInt();
        int Profit=Sell_Price-Cost_Price;
        double Percentage=(Profit/Cost_Price)*100;
        System.out.println("The Cost Price is "+ Cost_Price +" and Selling Price is " +Sell_Price);
        System.out.println("The Profit is " +Profit +" and the Profit Percentage is "+Percentage);
    }
}


