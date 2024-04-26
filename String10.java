import java.util.Scanner;
public class String10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().replaceAll("w","o")
                .replaceAll("#"," ").replaceAll("2","m")
                .replaceAll("lala","i").replaceAll("-","p");
        System.out.println(s);
    }
}
