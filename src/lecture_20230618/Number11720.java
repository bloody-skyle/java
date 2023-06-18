package lecture_20230618;
import java.util.Scanner;
public class Number11720 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.nextLine();
        S = sc.nextLine();
        int result=0;
        for(int i=0;i<n;i++){
            result+=S.charAt(i)-48;
        }
        System.out.println(result);
    }
}
