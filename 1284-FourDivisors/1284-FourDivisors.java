// Last updated: 8/12/2026, 3:13:19 PM
class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            int count = 0;
            int sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;                   
                    if (i * i != num) {
                        count++;
                        sum += num / i;
                    }
                }
                
                  if (count > 4) {
                    break;
                }
            }
            
            
            if (count == 4) {
                totalSum += sum;
            }
        }
        
        return totalSum;
    }
} 