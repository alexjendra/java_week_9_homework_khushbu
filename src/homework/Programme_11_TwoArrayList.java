package homework;

import java.util.ArrayList;

public class Programme_11_TwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the ArrayLists
        boolean areEqual = c1.equals(c2);

        if (areEqual) {
            System.out.println("c1 and c2 are equal.");
        } else {
            System.out.println("c1 and c2 are not equal.");
 }
}

}
