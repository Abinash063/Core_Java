import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int number = sc.nextInt();
        int reversedNumber = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = Math.abs(number); // Store the absolute value
        }

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("The number after reversal: " + reversedNumber);
    }
}
