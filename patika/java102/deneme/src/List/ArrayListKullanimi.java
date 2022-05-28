package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListKullanimi {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        // array listlere eleman ekle
        list.add("tolga");
        list.add("zafer");
        list.add("ugur");
        list.add("tolga");
        list.add("mehdi");

        // 1. Arraylistin özelliği
        System.out.println(list);

        // 2.ekranda gör
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 3. Ekranda gör
        for(String str : list){
            System.out.print(str + ", ");
        }

        // liste boyutu
        System.out.println("\nListe bouyutu: " + list.size());

        // belli index değeri
        int index = 2;
        System.out.println(index + ". index değeri: " + list.get(index));

        // indexOf ile indis değerini bulmak
        // HashSet deki gibi değerler uniqu olmadığından ya ilk ya da son indis değerini verir
        // eğer -1 indexi doner yoktur
        System.out.println("tolga " + list.indexOf("tolga") + ". index noktasında");
        System.out.println("tolga " + list.lastIndexOf("tolga") + ". son index noktasında");
        System.out.println("gsdgolga " + list.indexOf("gsdgolga") + ". ilk index noktasında");

        // araya deper girmek
        list.add(2, "ucuncu kısım");
        System.out.println("Araya eklendi:" + list);

        // değistir
        list.set(2, "3.değişti");
        System.out.println("liste: " + list);

        // varmı yok mu
        System.out.println("Varmı :" + list.contains("tolga"));

        // silme işlemi
        String silinen = list.remove(0);
        System.out.println(silinen + " öğesi silindi");
        System.out.println(list);

        // bir arraylisti başka arrayliste direk aktarabiliriz
        List<String> list2 = new ArrayList<>();
        list2.add("ılkdeğer");
        //list2.addAll(list);
        //belli indexten başlatabliyoruz
        list2.addAll(0, list);
        System.out.println("list2: " + list2);


        //belli aralığı almak için
        List<String> list3 = list.subList(1,4);
        System.out.println("list3: " + list3);

        // ilkel array yapısına sönüştürmek
        Object[] obj = list.toArray();
        System.out.println("ilkel aray: " + obj[0] + " " + obj[1]);
        System.out.println("liste: " + list);
        list.clear();
        System.out.println("liste: "+ list);

    }

}
