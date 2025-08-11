import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name= scanner.nextLine();//it accepts a string of character with  spaces
        System.out.println("Hello "+ name);
        System.out.println("Enter the second name: ");
        String name2= scanner.next();//it doesn't read any spaces
        System.out.println("Hello "+name2);
        /* output-->
        Enter the name:
        john cena
        Hello john cena
        Enter the second name:
        virat kohli
        Hello virat
        */
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Your name is "+ name +" Your age is: "+age);
        System.out.println("What is your gpa: ");
        double gpa=scanner.nextDouble();
        System.out.println("your gpa : "+gpa);
        System.out.println("Are you a student or not (True/False)? ");
        boolean isStudent=scanner.nextBoolean();
        System.out.println("student: "+ isStudent);

        //common issues
        System.out.println("Enter your age:");
        int AGE=scanner.nextInt();//in input buffer it contains \n
        scanner.nextLine();//to remove \n
        System.out.println("Enter your favourite color");
        String color=scanner.nextLine();
        System.out.println("You are "+age+"years old");
        System.out.println("You like the color: "+color);
        /*Enter your favourite color
    You are 53years old
    You like the color: */
        scanner.close();

    }
}
