package collection.Map.WeakEnumIdentifyMap;

import java.util.EnumMap;

enum Month{
    JAN,FEB,MAR,APR,MAY,JUN
        }

public class EnumDemo {
    public static void main(String[] args) {
        EnumMap<Month,String> em = new EnumMap<Month,String>(Month.class);
        em.put(Month.JAN,"Java");
        em.put(Month.FEB,"Html");
        em.put(Month.MAR,"Css");
        em.put(Month.APR,"Java Script");
        em.put(Month.MAY,"Spring");
        em.put(Month.JUN,"Jsp");

        System.out.println(em);

    }
}
