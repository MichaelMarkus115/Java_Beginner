package lesson09;

public class Customer {
    private int ID;
    private boolean loyaltyDiscount;

    public Customer(int ID) {
        this.ID = ID;
    }

    public void setLoyaltyPoints(boolean loyaltyPoints) {
        this.loyaltyDiscount = loyaltyPoints;
    }

    public boolean hasLoyaltyDiscount() {
        return loyaltyDiscount;
    }
}
