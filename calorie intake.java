import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner my = new Scanner(System.in);
	int x = my.nextInt();//calories needed
	int y = my.nextInt();//no of sweets eated
	int z = my.nextInt();//calorie of 1 sweet
	
	
	int calo = x-(y*z);
	if(calo>=0)
	{
	    System.out.println(calo);
	}
	else{
	    System.out.println(-1);
	}
	

	}
}
