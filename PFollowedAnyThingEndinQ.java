import java.util.Scanner;
import java.util.regex.Pattern;

public class PFollowedAnyThingEndinQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Pattern.matches("p.*q$",s));
    }
}
