import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner my = new Scanner(System.in);
		int t = my.nextInt();
		
		while(t-->0)
		{
		    int n = my.nextInt();// number of array inputs or the score of n subject we known
		    int m_s_pass = ((n*100)+100)/2;//calculate minimum score to pass
	        
	        //sum of first n scores
	        int sum=0;
	        for(int i = 0;i<n;i++)
	        {
	            int m =my.nextInt();
	            sum+=m;
	        }
	        
	        if((sum+100)<m_s_pass)
	        {
	            System.out.println(-1);
	        }
	        else if(sum>m_s_pass)
	        {
	            System.out.println(0);
	        }
	        else{
	            System.out.println(m_s_pass-sum);
	        }
		    
		}

	}
}
