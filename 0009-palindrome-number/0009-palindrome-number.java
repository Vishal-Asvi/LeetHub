class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
         }
         int reversednum = 0;
         int temp = x;
         int rem;
         while(temp!=0){
            rem = temp%10;
            reversednum = (reversednum*10)+rem;
            temp = temp/10;
         }
        
         return(reversednum==x);
           
         
         }
         }


        

