package Lec4;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n-1;
        int row = 1;

        while(row <= n){
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int i = 1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            row++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
