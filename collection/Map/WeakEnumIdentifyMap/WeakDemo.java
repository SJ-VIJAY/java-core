package collection.Map.WeakEnumIdentifyMap;
import java.util.WeakHashMap;

public class WeakDemo {
    public static void main(String[] args) {
        WeakHashMap<String,String > wh = new WeakHashMap<>();
        String s = new String("Vijay");
        String s1 = new String("Vicky");
        String s2 = new String("Parthi");

        wh.put(s,"Developer");
        wh.put(s1,"Accountant");
        wh.put(s2,"Fullstack");
        System.out.println(wh);
        s2 = null;
        System.gc();
        System.out.println(wh);

    }
}
