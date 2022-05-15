import  java.util.Scanner;
public class Main {

    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n;
        do {
            System.out.print("CIKIS[0]\nx in fibonacci değeri için: ");
            n = scn.nextInt();
            System.out.println("Fibonacci: " + fib(n));
        }while (n != 0);
    }
}

