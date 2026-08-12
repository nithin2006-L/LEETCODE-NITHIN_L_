// Last updated: 8/12/2026, 3:12:05 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
          
        return (mainTank + Math.min((mainTank - 1) / 4 , additionalTank)) * 10;
    } 
    }
