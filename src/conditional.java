import java.util.Scanner;
public class conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Are you a student or not?(True/False): ");
        boolean isStudent=sc.nextBoolean();
        //condition 1
        if(name.isEmpty()){
            System.out.println("You haven't entered your name yet!");
        }
        else{
            System.out.println("Welcome "+name+"!");
        }

        //condition 2
        if(age>=60){
            System.out.println("You are a senior citizen.");
        }
        else if(age>18 && age<60){
            System.out.println("You are an adult.");
        }
        else if(age<18 && age>0){
            System.out.println("You are a children.");
        }
        else {
            System.out.println("You are not born yet!");
        }

        //condition 3
        if(!isStudent){
            System.out.println("You are not a student.");
        }
        else{
            System.out.println("You are a student.");
        }


    }
}
