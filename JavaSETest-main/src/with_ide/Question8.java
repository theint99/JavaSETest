package with_ide;

public class Question8 {
    public static void main(String[] args) {
        int numbers[][]={
                {1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}
        };
        for (int row =0;row<numbers.length;row++){
            for (int column =0; column<numbers[row].length;column++){
                System.out.print(numbers[row][column]+"\t");

            }
            System.out.println();
        }
    }
}
