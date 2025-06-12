public class StringMirrorExample {
    public static String getMirrorImage(String input){
        final String METHOD_NAME = "getMirrorImage";
        System.out.println("Method Invoked:"+ METHOD_NAME + ":" + input);
        if(input==null){
            throw new NullPointerException("Input is NULL!!");
        }
        if(input.isEmpty()){
            throw new NullPointerException("Input is EMPTY!!");
        }
        String mirrorImage = null;
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        mirrorImage = input.concat("||").concat(sb.toString());
        return mirrorImage;
    }
    public static void main(String[] args) {
        //String input = "TAYYAB";
        //String input = null;
        String input = "";
        String mirrorImage = getMirrorImage(input);
        System.out.println("Output:Main:"+mirrorImage);
    }
}