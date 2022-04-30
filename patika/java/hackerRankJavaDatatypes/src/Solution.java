import java.util.*;
import java.io.*;
// Çalışmaz. Hackerrank 'teki soru alınıp yapılmıştır.
// bu kodların daha iyisi yazılabilir bence. ama ben bi yöntem bulamadım.
// hackerrankda long için değer verirken altını kırmızı çiziyordu. Belki Yöntemim yanlıştı.
// yapabilen?

public class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x +" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x<=0 || x>0)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



