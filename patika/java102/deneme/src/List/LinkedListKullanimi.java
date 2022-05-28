package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListKullanimi {
    public static void main(String[] args){

        //Array listlerdeki işlemler aynen yapıllır

        List<String> linkedlist = new LinkedList<>();

        linkedlist.add("mahmut");
        linkedlist.add("paşa");
        linkedlist.add("recep");
        linkedlist.add("mahmut");
        linkedlist.add("kel");

        System.out.println(linkedlist);

        Iterator<String> iterator = linkedlist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        linkedlist.remove(1);
        linkedlist.remove("mahmut");



        //foreach ile de linkedlistleri gezebiliriz
        for(String lst : linkedlist){
            System.out.print(lst + ", ");
        }

    }
}
