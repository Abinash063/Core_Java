import java.util.Scanner;
public class madLibsGame {
    public static void main(String[] args){
        //Mad Libs Games
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the adjective: ");
        String adj1=sc.nextLine();
        System.out.println("Enter the adjective: ");
        String adj2=sc.nextLine();
        System.out.println("Enter the adjective: ");
        String adj3=sc.nextLine();
        System.out.println("Enter the noun: ");
        String noun=sc.nextLine();
        System.out.println("Enter the verb ending with -ing: ");
        String verb=sc.nextLine();

        System.out.println("Today I went to a "+adj1+" zoo.");
        System.out.println(" In an exhibit I saw a "+noun+".");
        System.out.println(noun +" was "+ adj2 +" and "+verb+"!");
        System.out.println("I was "+adj3+"!" );
        /* output=>
        Enter the adjective:
        suspicious
        Enter the adjective:
        smelly
        Enter the adjective:
        happy
        Enter the noun:
        Mark
        Enter the verb ending with -ing:
        Screaming
        Today I went to a suspicious zoo.
         In an exhibit I saw a Mark.
        Mark was smelly and Screaming!
        I was happy!
         */
        sc.close();
    }
}
