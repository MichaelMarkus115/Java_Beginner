package lesson09;

public class Order {
    public static void main(String[] args) {
        Customer cust = new Customer(1);
        Item item = new Item();
        cust.setLoyaltyPoints(true);
        item.setPrice(cust);
    }
}
