// Last updated: 8/12/2026, 3:13:52 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        //creating stack to store character the processing string
        Stack<Character>stackS= new Stack<>();
        Stack<Character>stackT= new Stack<>();
        // processing string s( string  s into character in array)  
         for(char c:s.toCharArray()){
            if(c!='#'){
                stackS.push(c);
            }else if(!stackS.isEmpty()){
                stackS.pop();
            }
         }
         //string t into character in array
         for(char c:t.toCharArray()){
            if(c!='#'){
                stackT.push(c);
            }else if(!stackT.isEmpty()){
                stackT.pop();
            }
         }
        //stack s and stack t is equal return true orelse false
         return stackS.equals(stackT);
    }
}