public class ArrayDemo2 {
    public static void init(int[] input){
        input[2] = -3;
    }
    public static int searchAnElement(int[] input,int n){
        int length = input.length;
        if (length == 0) {return 0;}
        for (int i = 0;i < length;i++){
            if (input[i] == n){
                return i;
            }
        }return -1;
    }