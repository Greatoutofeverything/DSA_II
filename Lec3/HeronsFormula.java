package Lec3;

public class HeronsFormula {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        int s = (a+b+c)/2;

        int area = (int) Math.sqrt((s-a)*(s-b)*(s-c)*s);
        System.out.println(area);

    }
}
