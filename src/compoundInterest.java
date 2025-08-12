import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate= sc.nextDouble()/100;
        System.out.println("Enter the time period for which it is compunded per year: ");
        int time=sc.nextInt();
        System.out.println("Enter the number of years: " );
        int years=sc.nextInt();
        double amount = principal * Math.pow(1+rate/time,time * years);
        System.out.println("The amount after "+years+" years is "+amount);
        sc.close();

    }
}
