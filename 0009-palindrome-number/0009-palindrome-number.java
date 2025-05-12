class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int num=x;
        int reversed=0;

        while(num!=0){
            int lastdigit=num%10;
            reversed=reversed*10+lastdigit;
            num=num/10;
            
        }
    return reversed==x;
      
    }
}