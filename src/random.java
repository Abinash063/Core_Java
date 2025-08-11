import java.util.Random;
public class random{
    public static void main(String[] args){
        Random ran=new Random();
        int num1=ran.nextInt();
        int num2=ran.nextInt(1,7);//1 inclusive and 7 exclusive
        System.out.println(num1+" "+num2);
        //for double
        double num3=ran.nextDouble();
        double num4=ran.nextDouble(2.5,7.8);
        //for boolean
        boolean isHeads=ran.nextBoolean();
        if(!isHeads){
            System.out.println("Heads!");
        }
        else{
            System.out.println("Tails!");
        }
    }
}
