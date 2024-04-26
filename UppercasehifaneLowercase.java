import java.util.Scanner;
public class UppercasehifaneLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String s = sc.nextLine().replaceAll("(\\p{Lu})(\\p{Ll})", "$1-$2");
            System.out.println(s);
        }
    }
