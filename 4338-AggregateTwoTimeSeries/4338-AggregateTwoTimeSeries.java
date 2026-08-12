// Last updated: 8/12/2026, 3:11:35 PM
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {

        TreeSet<Integer> times=new TreeSet<>();
        for(int[] x:series1)
            times.add(x[0]);
        for(int[] x:series2)
            times.add(x[0]);

        List<List<Integer>>ans=new ArrayList<>();
        int i=0,j=0;
        for(int t:times){
            while(i<series1.length &&series1[i][0]<t)
                i++;
            while(j<series2.length&&series2[j][0]<t)
                j++;
            int v1=(i<series1.length)? series1[i][1]:0;

            int v2=(j<series2.length)? series2[j][1]:0;

            ans.add(Arrays.asList(t,v1+v2));
            
        }
        return ans;
        
    }
}