import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1 :");
        String s1=sc.next();
        System.out.print("Enter String2 :");
        String s2=sc.next();
        if(s1.endsWith(s2))
            System.out.println(s2+" is suffix of "+s1);
        else System.out.println(s2+" is not suffix of "+s1);

    }
}
