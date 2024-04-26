import java.util.Scanner;
import java.util.regex.*;
public class Digit10StartWith789 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Pattern.matches("^[789]\\d{9}$", s));
    }
}
