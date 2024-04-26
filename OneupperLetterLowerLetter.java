import java.util.*;
import java.util.regex.*;
import java.lang.*;
public class OneupperLetterLowerLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]+",s));
    }
}
