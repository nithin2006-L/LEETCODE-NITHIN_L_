// Last updated: 8/12/2026, 3:15:54 PM
import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {  
        PriorityQueue<Integer> pq = new PriorityQueue<>();   
        for (int ele : nums) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}