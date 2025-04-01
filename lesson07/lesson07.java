package lesson07;

public class lesson07  {
    public static void main(String[] args) {
        String hisName = "Fred Smith";
        String herName = new  String("Anne Smith");


//        String myString = "Hello";
//        System.out.println(myString);
//        myString = myString.concat(" World");
//        System.out.println(myString);
//        myString = myString + "!";
//        System.out.println(myString);


//        System.out.println("\nString Methods");
//        String hello = "Hello World";
//        int strLength = hello.length();
//        System.out.println(strLength);


//        String greet = " HOW ".trim();
//        System.out.println(greet);
//        String lc = greet + "DY".toLowerCase();
//       System.out.println(lc);

//        String lc = (greet + "DY").toLowerCase();
//        System.out.println(lc);

//        String phoneNum = "404-543-2345";
//        int idx1 = phoneNum.indexOf('-');
//        System.out.println("index of the first dash: " + idx1);
//
//        int idx2 = phoneNum.indexOf('-', idx1+1);
//        System.out.println("second dash idx: " + idx2);


        System.out.println("\n---StringBuilder Class---");
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");

        System.out.println(mySB);


//        System.out.println("\n---Primitive Data Types---");
//        int count = 15;
//        int a, b, c, d;
//
//        a = count++;
//        b = count;
//
//        c= ++count;
//        d = count;
//
//        System.out.println(a + ", " + b + ", " + c + ", " + d);

        short a, b, c;
        a = 1;
        b = 2;
        c = (short) (a + b);
        System.out.println(a + ", " + b + ", " + c);

//        int num1 = 55555;
//        long num2 = 66666;
//        long num3;
//        num3 = num1 * num2;
//
//        System.out.println(num3);


//        int num1 = 7;
//        double num2 = 2;
//        double num3;
//        num3 = num1/num2;
//
//        System.out.println(num3);
//
//
//        int myInt;
//        long myLong = 99L;
//        myInt = (int) (myLong);
//        System.out.println(myInt);

//        int num1 = 53;   //32 bits of memory to hold the value
//        int num2 = 47;   //32 bits of memory to hold the value
//        byte num3;  //8 bits of memory reserved
//        num3 = (num1 + num2); //causes compiler error

        int num1 = 53;
        int num2 = 47;
        int num3;  //changed from byte to int
        num3 = (num1 + num2);


        int n1 = 53;
        int n2 = 47;
        byte n3;
        n3 = (byte)(n1 + n2);

    }
}
