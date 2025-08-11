import java.sql.SQLOutput;

public class Variables {
    public static void main(String[]args){
        //variables->resuable container for a value , it behaves as if it was the value it contains
        //primitive-> simple values stored directly in memory(stack)
        //Reference-> memory address(stack) that points to heap.
        //primitive->int,double,char,boolean  vs  Reference->string,array,object
        int age;//declaration
        age=22;//assignment
        int year=2024;
        System.out.println("The Year is "+ year);

        double gpa=8.3;
        double temperature=-21.5;
        double quantity = 12;
        System.out.println("The temperature is "+ temperature);
        System.out.println("quantity is "+ quantity);//12.0

        char grade='A';//single quote
        char currency='$';
        System.out.println("The currency is " + currency);

        boolean isOnline= false;
        boolean isStudent=true;
        boolean onSale=true;
        System.out.println(isOnline);

        String name="Yash";
        System.out.println("The name is "+name);
        String email="YAP@gmail.com";
        System.out.println("The email is " + email);
        String car="Audi";
        //Use case of boolean
        if(isOnline){
            System.out.println("He is online!");
        }
        else{
            System.out.println("He is offline!");
        }

        System.out.println("Your name is "+ name +" Your  age is: "+ age+ " Your gpa is: "+gpa+" Is he online? "+isOnline);
        if(onSale){
            System.out.println("The "+ car+" is on sale.");
        }
        else{
            System.out.println("The "+car+"is not on sale");
        }
    }
}
