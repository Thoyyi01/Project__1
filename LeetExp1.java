import java.util.Arrays;

public class LeetExp1{
    public static void reverseArrayElements(int[] input){
        final String METHOD_NAME = "reverseArrayElements";
        System.out.println("Method Name :"+ METHOD_NAME + ":" + Arrays.toString(input));
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            int temp = input[start];input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        for (int i : input) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] input = {10,23,45,65,78,90};
    }
}