public class StringConsDemo {
    public static void main(String[] args){
        String str = "JAVA";//Literal Approach
        System.out.println("Size:"+str.length());
        System.out.println("isEmpty:" + str.isEmpty());
        System.out.println("Content:" + str.toString());

        //Default Cons
        String strCons1 = new String();
        System.out.println("Size:"+strCons1.length());
        System.out.println("isEmpty:" + strCons1.isEmpty());
        System.out.println("Content:" + strCons1.toString());

        //String arg cons
        String strCons2 = new String("Hello");
        System.out.println("Size:"+strCons2.length());
        System.out.println("isEmpty:" + strCons2.isEmpty());
        System.out.println("Content:" + strCons2.toString());

        char[] ta = {'D','U','D','E','K','U','L','A','.','T','A','Y','Y','A','B'};
        String strCons3 = new String(ta);
        System.out.println("Size:"+strCons3.length());
        System.out.println("isEmpty:" + strCons3.isEmpty());
        System.out.println("Content:" + strCons3.toString());

        String strCons4 = new String(ta,5,10);
        System.out.println("Size:"+ strCons4.length());
        System.out.println("isEmpty:" + strCons4.isEmpty());
        System.out.println("Content:" + strCons4.toString());

        StringBuilder sb = new StringBuilder("Thoyyi!!");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        String strCons5 = new String(sb);
        System.out.println(strCons5);

        StringBuffer sb1 = new StringBuffer("Thoyyi");
        String strCons6 = new String(sb1);
        System.out.println(strCons6);

        String s = "Howley";
        String s1 = "Howley";
        String s2 = "Howley";
        String s21 = "Howley";
        
        if (s == s1) {
            System.out.println("s and s1 are same object");
        } else {
            System.out.println("s and s1 are not same object");
        }
        System.out.println("Stage 3");
        if (s1 == s21) {
            System.out.println("s1 and s21 are same object");
        } else {
            System.out.println("s1 and s21 are not same object");
        }
        if (s.equals(s1)) {
            System.out.println("s and s1 are same content");
        } else {
            System.out.println("s and s1 are not same content");
        }
    }
}