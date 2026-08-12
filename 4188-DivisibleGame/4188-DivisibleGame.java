// Last updated: 8/12/2026, 3:11:47 PM
class Solution {
    static final int MOD=1_000_000_007;
    public int divisibleGame(int[] nums) {
        HashSet<Integer>divs=new HashSet<>();
        for(int x:nums){
            if(x>1) divs.add(x);
            int lim=(int)Math.sqrt(x);
            for(int d=2;d<=lim;d++){
                if(x%d==0){
                    divs.add(d);
                    divs.add(x/d);
                }
            }
        }
        long best=Long.MIN_VALUE;
        int bestK=2;

        if(divs.isEmpty()){
            best=-nums[0];
            
        }else {
            for(int K:divs){
                long cur=0;
                long mx=Long.MIN_VALUE;

                for(int x:nums){
                    long v=(x%K==0)?x:-x;

                    if(cur<0)
                        cur=v;
                    else
                        cur+=v;
                    if(cur>mx)
                        mx=cur;
                }
                if(mx>best||(mx== best&& K<bestK)){
                    best=mx;
                    bestK=K;
                }
            }
        }
        long ans=(best%MOD+MOD)%MOD;
        ans=ans*bestK%MOD;
        return (int)ans;
    }
}