package exercise_04_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Michael";
        String itemDesc = "Trousers";
        String message;

        message = custName + " would like to buy a " + itemDesc;

        System.out.println(message);


        ///
        double price = 10.00;
        double tax = 0.15;

        int noOfItems = 2;

        double total;

        message = custName + " would like to buy " + noOfItems + " " + itemDesc;

        total = price * (1 + tax);

        System.out.println(message + " and the price will be: R" + total);
    }
}
