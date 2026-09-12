class Solution {
    public boolean canAliceWin(int n) {
        

        if(n<10)
        {
            return false;
        }

        int flag =0;
        
       for(int i=10;i>=1;i--)
       {
            n=n-i;
            if(n<i-1)
            {
                flag =i;
                break;
            }
       }
        return flag % 2 == 0;
        
    }
}
