import java.util.Scanner;
public class String7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int f=0;
        String sp[]=s1.split(" ");
        for(int i=0;i<sp.length;i++){
            if(sp[i].equals(s2)){
                System.out.println("is can be found at index "+(i+1));
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("is cannot be found the index ");
    }
}
