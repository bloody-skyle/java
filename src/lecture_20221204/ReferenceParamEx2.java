package lecture_20221204;

class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);
        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }
    static void change(int[] x){
        x[0]=1000;
        System.out.println("chang() : x = " + x[0]);
    }
}
