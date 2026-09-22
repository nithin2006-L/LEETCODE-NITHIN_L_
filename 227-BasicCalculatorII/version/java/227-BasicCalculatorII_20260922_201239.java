// Last updated: 9/22/2026, 8:12:39 PM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return check(nums,k)-check(nums,k-1);
4    }
5    public int check(int [] nums,int k){
6        int l=0;
7        int r=0;
8        int cnt=0;
9        HashMap<Integer,Integer> h=new HashMap<>();
10
11        for(r=0;r<nums.length;r++){
12          h.put(nums[r],h.getOrDefault(nums[r],0)+1);
13          while(h.size()>k){
14            h.put(nums[l],h.getOrDefault(nums[l],0)-1);
15            if(h.get(nums[l])==0)
16             h.remove(nums[l]);
17             l++;
18          }
19          
20           cnt+=r-l+1;
21
22        }
23        return cnt;
24    }
25    
26}