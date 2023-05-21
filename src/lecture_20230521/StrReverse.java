package lecture_20230521;
import java.util.Scanner;
public class StrReverse {
    public static void makeStrReverse(String msg) {
        int i;
        int s = msg.length();
        StringBuilder reverseMsg = new StringBuilder();
        for(i=0;i<s;i++){
            reverseMsg.append(msg.charAt(s-i-1));
        }
        System.out.println(reverseMsg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        makeStrReverse(sc.nextLine());
    }
}
