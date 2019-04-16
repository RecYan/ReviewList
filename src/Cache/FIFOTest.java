package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yan_Jiang on 2019/4/16.
 * LinkedHashMap实现FIFO
 */
public class FIFOTest<K, V> extends LinkedHashMap<K, V> {

    private final int SIZE;
    public FIFOTest(int size) {
        super();
        SIZE = size;
    }

    /** 重写淘汰机制
     * 返回true的时候，就会remove其中最久的元素，可以通过重写这个方法来控制缓存元素的删除，
     * 当缓存满了后，就可以通过返回true删除最久未被使用的元素
     * 如果Map的尺寸大于设定的最大长度，返回true，再新加入对象时删除最老的对象
     * */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > SIZE;
    }

    public static void main(String[] args) {
        FIFOTest<Integer, Integer> map = new FIFOTest<>(5);
        for (int i = 0; i < 5; i++) {
            map.put(i, i);
        }
        System.out.println(map.toString());
        //模拟命中一次缓存数据
        map.put(2, 2);
        System.out.println(map.toString());
        //模拟修改缓存数据
        map.put(2, 3);
        System.out.println(map.toString());

        //新增缓存数据
        map.put(5, 5);
        System.out.println(map.toString());

    }

}
