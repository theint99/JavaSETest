package with_ide;

public class LargestNumber {
    public static void main(String[] args) {
        int a[] = new int[] { 23,24,12,78,62};
        int largest =0;
        for(int i = 1; i < a.length;i++) {
            if(a[i] > largest)
                largest = a[i];

        }
        System.out.println("The Largest Number is: " + largest);
    }
}
