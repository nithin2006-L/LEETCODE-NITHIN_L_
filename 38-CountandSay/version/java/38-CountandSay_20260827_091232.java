// Last updated: 8/27/2026, 9:12:32 AM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        HashMap<Integer,Integer> map =new HashMap<>();
4        int count=0;
5        for(int a:nums1)
6        {
7            for(int b:nums2)
8            {
9                int sum=a+b;
10                map.put(sum,map.getOrDefault(sum,0)+1);
11            }
12        }
13        for(int c : nums3)
14        {
15            for(int d:nums4)
16            {
17                int sum=c+d;
18                if(map.containsKey(-sum))
19                {
20                    count +=  map.get(-sum);
21                }
22            }
23        }
24        return count;
25    }
26}