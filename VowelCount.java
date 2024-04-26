import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.next();
        Pattern p=Pattern.compile("[aeiouAEIOU]");
        Matcher m=p.matcher(s);
        while(m.find())
            c++;
        System.out.println(c);
    }
}
