package programs;

public class Pg1 {
    public static void main(String[] args) {

        String str="hello world";
        String rev="";

        for (int i=0;i<str.length();i++)
        {
           rev =str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
