import java.util.Arrays;
import java.util.Scanner;
public class String14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().replace(",","").replace(".","").replace(" ","");
        String s2=sc.nextLine().replace(",","").replace(".","").replace(" ","");
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s11=new String(c1);
        String s12=new String(c2);
        System.out.println(s11);
        System.out.println(s12);
        if(Arrays.equals(c1,c2))
            System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");

    }
}
