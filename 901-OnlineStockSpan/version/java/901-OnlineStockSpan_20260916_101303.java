// Last updated: 9/16/2026, 10:13:03 AM
1class StockSpanner {
2    
3  
4    Stack<int[]> s;
5    
6    public StockSpanner() {
7        s = new Stack<>();
8    }
9    
10
11    
12    public int next(int price) {
13        int span = 1;
14        while (!s.isEmpty() && price >= s.peek()[0]) { // If the current price is greater than stack peek.
15            span += s.peek()[1];
16            s.pop();
17        }
18        s.push(new int[]{price, span});
19        return span;
20    }
21}