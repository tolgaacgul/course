package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hset {
    public static void main(String[] args){


        // f(x) = x*3 * xmod7 * sqrt(x)

        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("z");
        h.add(null);

        h.remove("b");
        System.out.println(h.size());
        System.out.println(h.contains("b"));
        for (String s : h) {
            System.out.println(s);
        }

        // Itertor kullanarak gezinmek
        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
