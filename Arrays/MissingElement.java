import java.util.HashMap;
import java.util.Map;

public class MissingElement {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 2, 3, 1, 0, 5 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], 1);
        }
        for (int i = 0; i < b.length; i++) {
            if (!hm.containsKey(b[i]))
                hm.put(b[i], 1);
            else
                hm.put(b[i], hm.get(b[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
           if( m.getValue()==1){
            System.out.println(m.getKey());
           }
        }
    }
}
