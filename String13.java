import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().replace("."," ");
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
            if(sp[i].length()==1) {
                System.out.print(sp[i]);
            }
        }
    }
}
