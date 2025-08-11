import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the triangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width of the triangle: ");
        double width=sc.nextDouble();

        //Area of the rectangle
        double area=length * width;
        System.out.println("The area of the triangle: "+area+" sq-cm");
        sc.close();

    }
}
