import java.util.Scanner;
import java.util.regex.Pattern;

public class StartWithSpecificNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(Pattern.matches(s1,s2));
    }
}
