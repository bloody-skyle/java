package lecture_20230618;
import java.util.Scanner;
public class Number2675 {
    public static void main(String[] args) {
        //근데 틀림ㅋㅋㅋ
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            String S = sc.nextLine();
            for(int j=0;j<m*m;j++) {
                System.out.printf("%c",S.charAt(j/m));
            }
        }
    }
}
