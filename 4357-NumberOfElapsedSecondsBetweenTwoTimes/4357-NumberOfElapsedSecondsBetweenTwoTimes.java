// Last updated: 8/12/2026, 3:11:15 PM
class Solution {
     public int secondsBetweenTimes(String startTime, String endTime) {
         int start = toSecond(startTime);
         int end =toSecond(endTime);
         return end-start;
        
   }
    private int toSecond(String t){
        int h=Integer.parseInt(t.substring(0,2));
        int m=Integer.parseInt(t.substring(3,5));
        int s=Integer.parseInt(t.substring(6,8));
        return h*3600+m*60+s;
    }
    
    }