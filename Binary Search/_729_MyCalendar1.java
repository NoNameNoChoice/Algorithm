
/*
 * @ClassName: MyCalendar1
 * @Description:
 * @Author: Se7en
 * @Date: 2020/8/28 6:33
 * @Version: 1.0
 */

import java.util.TreeMap;

public class _729_MyCalendar1 {

    private TreeMap<Integer, Integer> treeMap;

    public _729_MyCalendar1() {
        treeMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer low = treeMap.floorKey(start);
        if (low != null && treeMap.get(low) > start)
            return false;
        Integer high = treeMap.ceilingKey(start);
        if (high != null && high < end)
            return false;

        treeMap.put(start, end);

        return true;
    }
}
