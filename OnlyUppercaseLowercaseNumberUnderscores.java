import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlyUppercaseLowercaseNumberUnderscores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9_]+",s));
    }
}
