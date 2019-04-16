package Cache;

import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * Created by Yan_Jiang on 2019/4/16.
 */
public class AccessorderTest {
    @Test
    public void Test() throws Exception {
        LinkedHashMap<String, String> accessOrderTrue = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderTrue.put("1","1");
        accessOrderTrue.put("2","2");
        accessOrderTrue.put("3","3");
        accessOrderTrue.put("4","4");
        System.out.println("acessOrderTure"+accessOrderTrue);
        //访问过的元素放在链表后面，放置顺序是访问的顺序
        accessOrderTrue.get("2");
        accessOrderTrue.get("3");
        System.out.println("获取了数据"+accessOrderTrue);
        System.out.println("---------------------------------------------------------------------");
        LinkedHashMap<String, String> accessOrderFalse = new LinkedHashMap<>(16, 0.75f, false);
        accessOrderFalse.put("1","1");
        accessOrderFalse.put("2","2");
        accessOrderFalse.put("3","3");
        accessOrderFalse.put("4","4");
        System.out.println("accessOrderFalse"+accessOrderFalse);
        accessOrderFalse.get("2");
        accessOrderFalse.get("3");
        System.out.println("获取了数据"+accessOrderFalse);
    }

}
