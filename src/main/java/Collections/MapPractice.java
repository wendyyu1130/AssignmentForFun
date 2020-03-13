package Collections;

import java.util.Map;;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);

    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> obj = new ArrayList<Object>();
        for (Object a : map.keySet()){
            if(map.get(a) == value)
                obj.add(a);
        }

        Object[] a = obj.toArray();
        return a;
        

    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1,1,size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
         TreeMap<Integer, Integer> crazy = new TreeMap<Integer, Integer> ();
         for (int i = 1; i < size+1; i++) {
             if(i == 1) {
                 crazy.put(i, first);
             }else if(i == 2) {
                 crazy.put(i, second);
             }else{
                 Integer sum = crazy.get(i - 2) + crazy.get(i - 1);
                 crazy.put(i, sum);
             }
         }
         return crazy;
    }
}
