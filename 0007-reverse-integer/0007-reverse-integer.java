class Solution {
    public int reverse(int x) {
        double temp=0;
        int a;
        while(x!=0)
        {   a=x%10;
            temp=temp*10+a;
            x=x/10;
        }
        if((temp>Math.pow(2,31)-1)||(temp<Math.pow(-2,31)))
        {
            return 0;
        }
        return (int)temp;
    }
}