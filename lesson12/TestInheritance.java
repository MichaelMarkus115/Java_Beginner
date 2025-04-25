package lesson12;

public class TestInheritance {
    public static void main(String[] args) {
        //reference is superclass
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L'); //polymorphism
        Shirt shirt02 = new Shirt(20.00, 'M');  // Use valid constructor
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');

        shirt01.display();
        shirt02.display();
        System.out.println();
        trouser01.getItemID();
        trouser01.display();

        //must cast as trouser because it's a clothing instance
        displayDetails(trouser01);
    }

    public static void displayDetails(Clothing c1) {
        if(c1 instanceof Trouser) {  // Check if it's a Trouser before casting
            Trouser trouser = (Trouser) c1;  // Safe cast now
            char fitcode = trouser.getFit();
            System.out.println("Fit: " + fitcode);
        } else {
            System.out.println("The item is not a Trouser.");
        }
    }
}

class Clothing {
    // Fields
    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    // Constructors
    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    public Clothing(double price) {
        this.price = price;
    }

    // Access modifiers
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
    }
}

class Trouser extends Clothing {
    private char fit;
    private char gender;

    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID, desc, colourCode, price);
        this.fit = fit;
        this.gender = gender;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void display() {
        super.display();  // Call the display method from the Clothing class
        System.out.println("Fit: " + getFit());
        System.out.println("Gender: " + getGender());
    }
}

class Shirt extends Clothing {
    private char fit = 'U';

    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        super(itemID, desc, colourCode, price);
        this.fit = fit;
    }

    // Overloaded constructor
    public Shirt(char fit) {
        this(15.00, fit);  // Default price
    }

    public Shirt(double price, char fit) {
        super(price);
        this.fit = fit;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    // Overridden method
    public void display() {
        super.display();  // Call the display method from the Clothing class
        System.out.println("Fit: " + fit);
    }

    public void setColourCode(char colourCode) {
        super.setColourCode(colourCode);
    }

//    public abstract void display();
}
