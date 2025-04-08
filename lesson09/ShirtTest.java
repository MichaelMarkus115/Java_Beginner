package lesson09;

public class ShirtTest {
    public static void main(String[] args) {
        Shirt theShirt = new Shirt();
        char colorCode;
        //set a valid colorCode
        theShirt.setColorCode('R');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
        //Set an invalid color code
        theShirt.setColorCode('Z');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
    }
}
