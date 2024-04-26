import java.util.Scanner;
import java.util.regex.*;
public class AlphaNumericLength8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Pattern p=Pattern.compile("[a-zA-z0-9]{8}");
        Matcher m=p.matcher(s);
        if(m.matches()) System.out.println("true");
        else System.out.println("false");
    }
}
