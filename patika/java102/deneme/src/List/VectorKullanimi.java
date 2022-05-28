package List;

import java.util.Iterator;
import java.util.Vector;

public class VectorKullanimi {
    public static void main(String[] args){
        //java2 ile gelen özelliktir. bununla berabe arraylist sınıfları da kullanıma sunulmuştur.
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(5);
        vector.add(3);
        vector.add(15);

        System.out.println(vector);

        Iterator<Integer> iterator = vector.iterator();

        System.out.println("Iterator ile print");
        while(iterator.hasNext()){
            System.out.print(iterator.next() +  " -- ");
        }

    }
}
