public class StringArray {
    public static in getDigitSum(String[] input){
            final String METHOD_NAME = "getDigitSum";
            System.out.println("Method Invoked:" + METHOD_NAME + ":" + input);
            int digitsSum = 0;
            for (String str : input){
                System.out.println(str);
                char[] ch = str.toCharArray();
            for (char c : ch){
                System.out.println(c);
                if (Character.isDigit(c)){
                    digitSum = digitsSum + Character.getNumericValue(c);
                }
            }
            }
            System.out.println("Method Responce:" + METHOD_NAME );
            return digitsSum;
        } 
    }
    public static void main(String[] args){
        String[] names = {"Tayyab@10","Howley@1","Badrinath@5","Akhil@10"};
        for (String str : names){
            System.out.println(str.toUpperCase());
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index " + i + ": " + names[i]);
        }
    }
}