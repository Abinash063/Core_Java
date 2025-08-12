public class ternaryOperator {
    public static void main(String[] args){
        //ternary operator: variable = (condition) ? if True: if False
        int score=85;
        String passOrFail = (score>=60) ? "PASS" : "Fail";
        System.out.println(passOrFail);

        int num=78;
        String evenOrOdd = (num%2==0) ? "Even" :"Odd";
        System.out.println(evenOrOdd);

        int hour=14;
        String timeOfDay = (hour<12) ? "A.M": "P.M";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxtRate = (income<200000) ? 5.0 : 12.5;
        System.out.println(taxtRate);
    }
}
