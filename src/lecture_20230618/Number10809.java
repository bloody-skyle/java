package lecture_20230618;
import java.util.Scanner;
public class Number10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int a[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int i=97;i<123;i++){
            for(int j=S.length()-1;j>=0;j--){
                if((int)(S.charAt(j))-i==0){
                    a[i-97]=j;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
