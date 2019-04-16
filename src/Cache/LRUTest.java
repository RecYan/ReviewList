package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yan_Jiang on 2019/4/16.
 * LinkedHashMap实现LRU
 */
public class LRUTest<K, V> extends LinkedHashMap<K, V> {

    private final int SIZE;

    public LRUTest(int size) {
        //AccessOrder:true--> 访问过的元素放在链表后面，放置顺序是访问的顺序s
        super(16, 0.75f, true);
        SIZE = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > SIZE;
    }

    public static void main(String[] args) {
        LRUTest<Integer, Integer> map = new LRUTest<>(5);
        for (int i = 0; i < 5; i++) {
            map.put(i, i);
        }
        System.out.println(map.toString());

        map.get(2);
        System.out.println(map.toString());

        map.put(2, 3);
        System.out.println(map.toString());

        map.put(5, 5);
        System.out.println(map.toString());

    }
}
