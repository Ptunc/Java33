package java33;

import java.util.Scanner;

public class java33 {
    public static int Fibonacci(int a, int temp, int onceki){
        int top=0;
        if(a>=0){
            top = temp + onceki;
            onceki = temp;
            temp = top;
           return System.out.print(top + ", " + Fibonacci(a-1));
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("seri sayısı: ");
        int temp = 1, onceki = 0;
        a = input.nextInt();
        Fibonacci(a, temp, onceki);
        input.close();
    }
}
