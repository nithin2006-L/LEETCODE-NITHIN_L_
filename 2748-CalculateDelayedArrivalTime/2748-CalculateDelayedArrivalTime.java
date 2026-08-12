// Last updated: 8/12/2026, 3:12:13 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(  arrivalTime+delayedTime)%24;
    }
}