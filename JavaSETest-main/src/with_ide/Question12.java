package with_ide;

import java.util.ArrayList;

public class Question12 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);


        arr.add("10");
        arr.add("20");
        arr.add("30");
        arr.add("40");

        arr.remove(1);

        System.out.println("After removing  ");
        for (String number : arr) {
            System.out.println("Output is: " + number);
        }
    }
}
