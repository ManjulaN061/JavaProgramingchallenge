public class Program01_maxof3numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        /*int result1=(a>b)?a:b;
        int result2=(result1>c)?result1:c;
        int max=(result1>result2)?result1:result2;*/
        int max=(a>b)?((a>b)?a:b):((b>c)?b:c);
        System.out.println(max);
    }
}
