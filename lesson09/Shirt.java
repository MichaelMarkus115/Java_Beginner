package lesson09;

public class Shirt {
    private int ShirtID = 0;
    private String description = "-description required-";
    private char colorCode = 'U'; //'U' = Unset
    private double price = 0.0; //default price for all items

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    //additional get and set methods for ShirtID, description, and price would follow
}//end of class
