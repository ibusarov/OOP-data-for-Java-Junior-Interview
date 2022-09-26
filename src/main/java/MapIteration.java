import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {
        Map<Integer, String> qfk = new HashMap<>();

        qfk.put(1, "Pesho");
        qfk.put(2, "ivan");
        qfk.put(3, "Ani");
        qfk.put(4567, "default");

        System.out.println("1 - For Each Method");


        qfk.forEach((k, v) -> System.out.println("key= " + k + " value= " + v));
        System.out.println("=================================================");

        System.out.println("2 - Entry Set Method");

        for (Map.Entry<Integer, String> entry : qfk.entrySet()) {
            System.out.println("key= " + entry.getKey() + " value= " + entry.getValue());
        }
        System.out.println("=================================================");
        System.out.println("3 - Key Set");

        for (Integer key : qfk.keySet()) {
            System.out.println("key= " + key);
        }
        System.out.println("=================================================");

        System.out.println("4 - Method Value");


        for (String value : qfk.values()) {
            System.out.println("Value= " + value);
        }

        System.out.println("=================================================");

        System.out.println("Iterator");

        Iterator<Map.Entry<Integer, String>> itr = qfk.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + " value: " + entry.getValue());
        }

    }


}
