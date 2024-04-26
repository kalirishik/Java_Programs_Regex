import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1 :");
        String s1=sc.next();
        System.out.print("Enter String2 :");
        String s2=sc.next();
        if(s1.contains(s2))
            System.out.println(s2+" is part of "+s1);
        else System.out.println(s2+" is not part of "+s1);

    }
}
