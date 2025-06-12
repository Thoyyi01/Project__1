public class ArrayDemo2 {
    public static void init(int[] input){
        system.out.println("init method:" + a);
        System.out.println(Arrays.toString(a));
        a[2] = -3;
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        int[] input = {10,3,7};
        System.out.println(input[0]+input[1]+input[2]);
        init(input);
        System.out.println(input[0]+input[1]+input[2]);
    }
}