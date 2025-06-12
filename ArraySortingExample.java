import java.util.Scanner;
public class ArraySortingExample{
    public void doBubbleSort(int[] input) {
        final String METHOD_NAME = "doBubbleSort";
        System.out.println("Method Invoked : "+ METHOD_NAME + ":" + Arrays.toString(input));
        for (int i = 0;i < input.length;i++) {
            for ( int j = 0;j < input.length;j++) {
                int temp = 0;
                if (input[j] < input[i]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
    public int binarySearch(int arr[],int x) {
        
    }
}