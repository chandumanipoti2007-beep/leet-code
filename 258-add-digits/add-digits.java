class Solution {
    public int addDigits(int num){
     while(num>=10){
        int rem=0;
        while(num>0){
            int dig=num%10;
            rem+=dig;
            num/=10;
        }
        num=rem;
     } 
     return num;  
    }
}