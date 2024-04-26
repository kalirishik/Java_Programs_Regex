import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            System.out.println("index: "+i+",Character: "+s.charAt(i));
        }
    }
}
