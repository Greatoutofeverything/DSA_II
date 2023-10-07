package Lec4;

public class MaxOf3 {
    public static void main(String[] args) {

        int a = 120;
        int b = 140;
        int c = 15;
        if(a>b && a>c){
            System.out.println("a");
        }else if (b>c){
            System.out.println("b");
        }else{
            System.out.println("c");
        }
    }
}
