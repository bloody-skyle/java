package lecture_20230528;

public class Leacture01 {
    public static void main(String[] args) {

        //배열 1차원
        //배열의 메모리공간 할당과 초기화 동시진행
        int[] intArr = {1,2,3,4};

        //위에것과 같지만 다른 표현 방식
        int[] intArr2 = new int[] {1,2,3,4};

        //메모리 공간 할당
        int[] intArr4 = new int[4];

        System.out.println("intArr의 크기 : " + intArr.length);
    }
}
