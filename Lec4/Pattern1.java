package Lec4;

public class Pattern1 {
    public static void main(String[] args) {
        int stars = 5;
        int row = 1;
        int n = 5;
        while(row<=n) {
            //stars
            int i = 1;
            while (i <= stars) {
                System.out.print("*");
                i++;
            }
            row++;
            System.out.println();
        }
    }
}
