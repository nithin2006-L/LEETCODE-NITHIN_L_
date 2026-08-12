// Last updated: 8/12/2026, 3:14:58 PM
class Solution{
public void reverseString(char[]s){
int st=0,en=s.length-1;
while(st<en){
char temp=s[st];
s[st]=s[en];
s[en]=temp;
st++;
en--;
}
}
}