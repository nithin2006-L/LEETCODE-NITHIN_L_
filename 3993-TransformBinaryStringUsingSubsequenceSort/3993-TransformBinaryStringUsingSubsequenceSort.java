// Last updated: 8/12/2026, 3:11:50 PM
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n=s.length();
        int totalOnes=0;

        for(char c:s.toCharArray()){
            if(c=='1') totalOnes++;
        }
        boolean[] ans=new boolean[strs.length];

        for(int k=0;k<strs.length;k++){
            char[] t=strs[k].toCharArray();
            int fixedOnes=0;
            int qCount=0;
            for(char c:t){
                if(c=='1')fixedOnes++;
                else if(c=='?') qCount++;
            }
            if(fixedOnes> totalOnes||fixedOnes+qCount<totalOnes){
                ans[k]=false;
                continue;
            }
            int need=totalOnes-fixedOnes;
            for(int i=0;i<n;i++){
                if(t[i]=='?') t[i]='0';
            }
                   for(int i=n-1;i>=0&&need>0;i--){
                       if(strs[k].charAt(i)=='?'){
                           t[i]='1';
                           need--;
                       }
                   }

            int sOnes=0;
            int tOnes=0;
            boolean ok=true;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') sOnes++;
                if(t[i]=='1') tOnes++;
                if(tOnes>sOnes){
                        ok =false;
                        break;
                    }
                }
                ans[k]=ok;
            }
            return ans;
        }
        
    }
