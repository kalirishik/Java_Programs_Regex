import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.next();
        System.out.print("Enter Integer : ");
        int n=sc.nextInt();
        System.out.println(s.substring(0,n)+" - "+s.substring(n));
    }
}
