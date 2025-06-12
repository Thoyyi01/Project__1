import java.util.Scanner;

public class ArrayDemo1 {
    static int[] input = new int[10];
    public static void displayElement() {
        for(int i=0;i < input.length;i++){
            System.out.println(input[i]);
        }
    }
    public static void initializeArray(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i < input.length;i++){
            System.out.println("Enter Array Element");
            input[i] = scanner.nextInt();
        }
    }
    public static void arrayDemo(){
        //
        int[] input = {10,23,34,45,67,78,90,89,55};
        //JAVA 1.5 - For Each Loop
        for(int i:input){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        initializeArray();
        displayElement();
        arrayDemo();
    }
}