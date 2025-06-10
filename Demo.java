import java.util.Scanner;


public class Demo {
    public static void main(String[] args){
        System.out.println("I am main method");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No!!");
        int input = scanner.nextInt();
        int digitsSum = 0;
        int countOfDigits = 0;
        while (input > 0){
            int remainder = input % 10;
            digitsSum = digitsSum + remainder;
            input = input / 10;
            countOfDigits++;
            System.out.println(remainder);
        }
        System.out.println("digitsSum");
        System.err.println("countofDigits");
    }
}