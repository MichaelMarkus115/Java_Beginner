package lesson04;

public class lesson04 {
    public static void main(String[] args) {
//        String name = "Sam";
//        double price = 12.35;
//        boolean outOfStock = true;

        //2 variables  declared and init
//        String country = "USA", state = "CO";

        String greet1 = "Hello";
        String greet2 = "World";
        String message1 = greet1 + " " + greet2 + "!";
        String message2 = greet1 + " " + greet2 + " " + 2014 + "!";

//        System.out.println(message2);

        //int vars
        int quantity = 10;
//        int quantity2 = 5.5; //this will cause compilation to fail

        //double vars
        double price = 25.99;
        double price2 = 75; //run time will interpret as 75.0

        //manipulation of numbers
        int age = 70;
        int count = 21;
        age++;
        count--;
        /*System.out.println(age);
        System.out.println(count);*/

        int c = 25 - 5 * 4 / 2 - 10  + 4;


        c /= 9;
        System.out.println(c);


    }
}
