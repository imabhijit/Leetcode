package KClosestPoints;

import java.util.Arrays;

public class Solution1 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> (difference(p1,p2)));
        return Arrays.copyOfRange(points, 0, K);
    }

    public int difference(int[] p1, int[] p2){
        return (p1[0]*p1[0] + p1[1]*p1[1])-(p2[0]*p2[0] + p2[1]*p2[1]);
    }
}
