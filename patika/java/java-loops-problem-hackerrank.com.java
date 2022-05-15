import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){

        /*
        SERİ:
        (a + (2^0)*b),(a + (2^0)*b + (2^1)*b), ... , (a + (2^0)*b + (2^1)*b + ... + (2^(n-1))*b)
        */

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            int beforeTotal = a;
            for(int us=0; us < n; us++){
                beforeTotal += ((Math.pow(2,us))*b);
                System.out.print(beforeTotal + " ");
            }
            System.out.println();
        }
        in.close();
        

        
    }
}
