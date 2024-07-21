public class Program02_maxof3numbers_usingIfelse_Conditions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = 0;
        if (a > b && a > c) {
            System.out.println("largest value" + a);
        } else if (b > a && b > c) {
            System.out.println("largest value" + b);
        } else {
            System.out.println("largest value" + c);
    }
}
}
