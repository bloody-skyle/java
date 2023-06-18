package lecture_20230618;
import java.util.Scanner;
public class Number9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String T = sc.nextLine();
        for(int i=0;i<s;i++){
            T = sc.nextLine();
            System.out.printf("%c",T.charAt(0));
            System.out.println(T.charAt(T.length()-1));
        }
    }
}