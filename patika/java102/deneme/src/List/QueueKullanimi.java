package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueKullanimi {
    public static void main(String[] args){
        // LinkedList hem queue hem de list yapısından kalıtım alır
        // Üretildiği yere göre davranır.

        //FIFO yapısına göre çalışır

        Queue<String> q = new LinkedList<>();
        q.add("Tolga");
        q.add("fatma");
        q.add("merhum");

        System.out.println(q);

        Iterator<String> i = q.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + ", ");
        }

        // silme işleminde FIFO yapısına göre silme işlemi gerçekleşir
        q.remove();
        System.out.println("\nFıfo Silme işlemi");
        System.out.println(q);

        // silinecek oğeyi belirtebiliriz
        boolean isDelete = q.remove("merhum");
        System.out.println("silindi mi: " + isDelete);


        //.element() bize kuyruğun başında ki elemanı verir
        // ilk önce eleman ekleyelim

        q.add("ts");
        q.add("bjk");
        q.add("tr");
        q.add("fr");
        q.add("us");

        System.out.println("yeni eklendi : " + q);
        System.out.println("kuyruğun başı: " + q.element());

        // .poll() öğeyi döner ve kuyruktn siler
        System.out.println("poll(): " + q.poll());
        System.out.println("poll() metodundan sonra");
        System.out.println(q);

        // peek() kuğruğun başındaki elamanı verir ve silmez
        System.out.println("peek(): " + q.peek());
        System.out.println("peek() methodundan sonra");
        System.out.println(q);


    }
}
