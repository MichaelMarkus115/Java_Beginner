package lesson06;

import javax.swing.text.DefaultEditorKit;

public class lesson06 {
    public static void main(String[] args) {

        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        //Changing field values
        cust1.age = 40;
        cust2.name = "Duke";

        //accessing another class's methods
//        cust1.cart.cancel();

        //calling method(s) on our field values
        cust1.displayCustomer();
        cust2.displayCustomer();
        }
    }

    class Customer {
    //fields
        public String name = "Junior Duke";
//        public Cart class;
        public int custID = 1205;
        public String address;
        public int orderNum;
        public int age;
    //method(s)
        public void displayCustomer() {
            System.out.println("Customer: " + name);
        }
    }

    class Cart {
//        public Item[] items;
        public String date;
        public double total;

        public void cancel() {

        }
    }
