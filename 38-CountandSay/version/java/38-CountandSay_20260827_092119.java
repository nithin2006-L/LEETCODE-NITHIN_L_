// Last updated: 8/27/2026, 9:21:19 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        // Step 1: Count frequency of every number
5        HashMap<Integer,Integer> map = new HashMap<>();
6
7        for(int element : nums){
8            map.put(element, map.getOrDefault(element,0)+1);
9        }
10
11        // Step 2: Convert HashMap into a List
12        ArrayList<Map.Entry<Integer,Integer>> arr =
13                new ArrayList<>(map.entrySet());
14
15        // Step 3: Sort by frequency in descending order
16        arr.sort((a,b)->b.getValue()-a.getValue());
17
18        // Step 4: Pick first K elements
19        int[] last = new int[k];
20
21        for(int i=0;i<k;i++){
22            last[i]=arr.get(i).getKey();
23        }
24
25        return last;
26    }
27}