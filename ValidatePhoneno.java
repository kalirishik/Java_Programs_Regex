import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidatePhoneno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Pattern.matches("[+91]*[0-9]{10}",s));
    }
}
