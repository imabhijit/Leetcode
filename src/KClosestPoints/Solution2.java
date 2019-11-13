package KClosestPoints;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(K + 1, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]);
            }
        });

        for (int[] p : points) {
            maxHeap.add(p);
            if (maxHeap.size() > K) {
                maxHeap.poll();
            }
        }

        int[][] output = new int[K][2];
        while (K > 0) {
            output[--K] = maxHeap.poll();
        }
        return output;
    }
}
