import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1 :");
        String s1=sc.next();
        System.out.print("Enter String2 :");
        String s2=sc.next();
        if(s1.equals(s2))
            System.out.print("Equal");
        else if(s1.equalsIgnoreCase(s2))
            System.out.print("Equal if IgnoreCase");
        else
            System.out.println("Not Equal");
    }
}
