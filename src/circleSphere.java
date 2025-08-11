import java.util.Scanner;
public class circleSphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius=sc.nextDouble();
        //Area of Circle
        double area = Math.PI*Math.pow(radius,2);

        //Circumference of Circle
        double circumference = 2*Math.PI*radius;

        //Volume of Sphere
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.println("The Area of the circle is:  "+area);
        System.out.println("The circumference of the circle is: "+circumference);
        System.out.println("The Volume of the Sphere is: "+volume);
    }
}
