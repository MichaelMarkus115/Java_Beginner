package exercise_05_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Michael";
        String itemDesc = "Trouser";
        String message;

        message = custName + " would like to buy a " + itemDesc;

        System.out.println(message);


        ///
        double price = 10.00;
        double tax = 0.15;

        int noOfItems = 0;

        double total;

        message = custName + " would like to buy " + noOfItems + " " + itemDesc;

        total = price * (1 + tax);

        boolean outOfStock = false;


        if (noOfItems > 1) {
            message += "s";
        }

        if (outOfStock) {
            System.out.println("Sorry we are out of stock :(");
        }
        else{
            System.out.println(message);
            System.out.println(message + " and the price will be: R" + total);
        }


    }
}
