import java.util.Scanner;
public class String8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int n=sc.nextInt();
        int index=s1.indexOf(s2,n);
        if(index!=-1)
            System.out.println("can be found at index "+index);
        else System.out.println("is not present starting from position");
        }
    }
