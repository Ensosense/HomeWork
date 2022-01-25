package HomeWork2;

public class lesson_2 {

    public static void main(String[] args) {

        System.out.println(sum(10, 6));
        checkTheNumber(-8);
        System.out.println(positiveOrNegative(-13));
        printTheMessage("Print me, please", 7);
        System.out.println(leapYear(2020));

    }
    public static boolean sum (int a, int b){

        if ((a + b) > 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkTheNumber (int a){
        if ( a >= 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }

    public static boolean positiveOrNegative (int a){
        if( a >= 0){
            return false;
        } else {
            return true;
        }
    }

    public static void printTheMessage (String m, int n)
    {
        for(int i = 0; i < n; i++)
        System.out.println(m);
    }

    public static boolean leapYear (int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        } else {
            return false;
        }
    }
}

