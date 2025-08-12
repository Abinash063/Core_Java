import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(Integer): ");
        int num=sc.nextInt();
        int sum=0;
        if(num==0){
            System.out.println("The sum of the digits is: " +num);
        }
        else if(num<0){
            System.out.println("Enter a positive number and try again!");
        }
        else{
            int temp=num;
            while(temp > 0){
                int digit=temp%10;
                 sum+=digit;
                temp/=10;
            }
            System.out.println("The sum of the digits is: "+sum);

        }
          sc.close();
    }
}
