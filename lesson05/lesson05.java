package lesson05;

public class lesson05 {
    public static void main(String[] args) {
//        IF/ELSE
//        int attendees = 4;
//        boolean largeVenue;
//
//        if (attendees >= 5) {
//            largeVenue = true;
//            System.out.println("We are going to need a large venue!");
//        }
//        else {
//            largeVenue = false;
//            System.out.println("No need for a large venue");
//        }

//        WORKING WITH ARRAY OF ITEMS
//        String itemDesc1 = "Shirt", itemDesc2 = "Trousers", itemDesc3 = "Scarf";
//
//        String[] items = {"Shirt", "Trousers", "Scarf"};
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i]);
//        }

//        int[] numbers = {27, 12, 82, 70, 54, 1, 30, 34};
//
//        String[] names = {"Mary", "Bob", "Carlos"};
//        int[] ages = {25, 27, 48};
//
//        String[] names2 = new String[3];
//        names2[0] = "Mary";
//        names2[1] = "Bob";
//        names2[2] = "Carlos";
//
//        int[] ages2 = new int[3];
//        ages2[0] = 25;
//        ages2[1] = 27;
//        ages2[2] = 48;

//        System.out.println(names2[0] + " is " + ages2[0] + " years old!");
//        String[] names = {"George", "Jill", "Xinyi", "Ravi"};
//
//        for (String n : names) {
//            System.out.println("Name is: " + n);
//        }
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4, 6, 2, 8, 12, 35, 9};

        for (int unitScore : scores) {
            if (unitScore >= 12) {
                passed = true;
                break;
            }
        }
//        System.out.println("At least 1 passed?: " + passed);

        int[] sizes = {4, 18, 5, 20};
        for (int size : sizes) {
            if (size > 16) {
                break;
            }
            System.out.println("Size: " + size + ", ");
        }

    }
}
