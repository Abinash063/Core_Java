import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Shopping Cart
        System.out.println("Welcome to our Shopping app!");
        System.out.println("Enter the name of the item: ");
        String items=sc.nextLine();
        System.out.println("Enter the price for each item: ");
        double price=sc.nextDouble();
        System.out.println("Enter the quantity of the product required: ");
        int quantity=sc.nextInt();


        double amount=price*quantity;
        System.out.println("The total price of "+ items+" of quantity "+ quantity+" is: "+amount);
        System.out.println("Visit again!");


        sc.close();

    }
}
