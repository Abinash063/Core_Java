import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arrayLists {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //Arraylists->A resizable array that stores objects (autoboxing). Array are
        //fixed but arraylists can change

       /* ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(45);
        list.add(65);
        System.out.println(list);//output->[1, 45, 65]*/

        /*ArrayList<Double> list = new ArrayList<>();
        list.add(2.34);
        list.add(87.9);
        list.add(4.7);
        System.out.println(list);//[2.34, 87.9, 4.7]*/

        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("oranges");
        System.out.println(fruits);
        //output->[mango, apple, kiwi, oranges]
        fruits.remove(0);
        System.out.println(fruits);
        //output->[apple, kiwi, oranges]

        fruits.set(1,"pineapple");
        System.out.println(fruits);
        //output->[apple, pineapple, oranges]

        System.out.println(fruits.get(2));//oranges
        System.out.println(fruits.size());//3

        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        /*output->
        apple
        oranges
        pineapple
         */
        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter the number of food you would like:  ");
        int numOfFood = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=numOfFood;i++){
            System.out.println("Enter the food "+i+": ");
            String food = sc.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        sc.close();
        //output->[pizza, burger, cake, pasta]

    }
}
