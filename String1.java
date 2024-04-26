import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Length : "+s.length());
        if(s.isEmpty())
            System.out.println("Empty ? true");
        else
            System.out.println("Empty ? false");
        System.out.println("UpperCase : "+s.toUpperCase());
        System.out.println("LowerCase : "+s.toLowerCase());
    }
}
