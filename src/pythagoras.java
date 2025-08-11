import java.util.Scanner;
public class pythagoras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the triangle: ");
        double len1=sc.nextDouble();

        System.out.println("Enter the length of the other side of the triangle: ");
        double len2=sc.nextDouble();
        //hypotenuse length
        double hypo=Math.sqrt(Math.pow(len1,2)+Math.pow(len2,2));
        System.out.println("The length of the hypotenuse is: "+hypo);
        sc.close();
    }
}
