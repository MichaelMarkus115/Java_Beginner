package exercise_05_1;

public class ShoppingCart {
    public static void main(String[] args) {
//        String custName = "Michael";
//        String itemDesc = "Trouser";
//        String message;
//
//        message = custName + " would like to buy a " + itemDesc;
//
//        System.out.println(message);
//
//
//        ///
//        double price = 10.00;
//        double tax = 0.15;
//
//        int noOfItems = 0;
//
//        double total;
//
//        message = custName + " would like to buy " + noOfItems + " " + itemDesc;
//
//        total = price * (1 + tax);
//
//        boolean outOfStock = false;
//
//
//        if (noOfItems > 1) {
//            message += "s";
//        }
//
//        if (outOfStock) {
//            System.out.println("Sorry we are out of stock :(");
//        }
//        else{
//            System.out.println(message);
//            System.out.println(message + " and the price will be: R" + total);
//        }


//        /// 2
//        String custName = "Michael";
//        String message =custName + " wants to buy several items.";
//
//        //declare string array and init it
//        String[] items = {"Trousers", "Shirt", "Hat", "Sock"};
//
//        //message = no of items bought
//        message = custName + " want to purchase " + items.length + " items!";
//        System.out.println(message);
//
//        //print element from the array
//        System.out.println(items[3]);
//        //System.out.println(items[4]); Index 4 doesn't exisit as there are only 4 items

        //3
        //local variables
        String custName = "Michael";
        String message;

        double price = 15.00;
        int qty = 4;
        double tax = 1.05;


        String[] items;
        items = new String[4];
        items[0] ="Pants";
        items[1] = "Shirt";
        items[2] = "Socks";
        items[3] = "Tie";

        message = custName + " wants to buy " + items.length + " items.";
        System.out.println(message);

        for(String item: items) {
            System.out.println(item + ", ");
        }



    }
}
