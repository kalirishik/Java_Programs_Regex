import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.compareTo(s2);
        int l2=s2.compareTo(s1);
        System.out.println(l1);
        System.out.println(l2);
        if(l1>l2)
           System.out.println(s2+","+s1);
        else
            System.out.println(s1+","+s2);
    }
}
