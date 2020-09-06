
/*
 * @ClassName: _295_MedianFinder
 * @Description:
 * @Author: Se7en
 * @Date: 2020/9/6 7:29
 * @Version: 1.0
 */

import java.util.PriorityQueue;

public class _295_MedianFinder {

    private int count;
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    /** initialize your data structure here. */
    public void MedianFinder() {
        count = 0;
        maxHeap = new PriorityQueue<>((x, y) -> y - x);
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        count += 1;
        maxHeap.offer(num);
        minHeap.add(maxHeap.poll()); //maxHeap.poll() will be the largest number
        if ((count & 1) != 0) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if ((count & 1) == 0) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return (double) maxHeap.peek();
        }
    }
}
