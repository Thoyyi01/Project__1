public class StringInstanceMethods {
    public static void main (String[] args) {
        String s = "Tayyab";
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        char c = s.charAt(0);
        System.out.println(c);
        String s1 = "Welcome to String Applications";
        System.out.println(s1.length());
        String s2 = s1.trim();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        int intvalue = 10;
        System.out.println(intvalue);
        String intStrRep = String.valueOf(intvalue);
        System.out.println(intStrRep);
        System.out.println(String.valueOf('C'));
        System.out.println(String.valueOf(123.45f));
        System.out.println(String.valueOf(123.456d));
        System.out.println(String.valueOf(true));
        int i = Integer.parseInt(intStrRep);
        System.out.println(i);
    }
}