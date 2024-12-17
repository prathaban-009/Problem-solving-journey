import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
   int n=sc.nextInt();
   int b[]=new int[n-1];
   for(int i=0;i<n-1;i++){
       b[i]=sc.nextInt();
   }
Arrays.sort(b);
int a[]=new int[n];
a[0]=b[0]/2;
for(int i=1;i<n;i++){
   a[i]=b[i-1]-a[i-1];
}
for(int i=0;i<n;i++){
   System.out.print(a[i]+" ");
}
System.out.println();
}
}
}





//my answer

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
        	public static void main (String[] args) throws java.lang.Exception
        	{
        		 Scanner my = new Scanner(System.in);
        
        int t = my.nextInt();
        
        while (t-- > 0) {
            int n = my.nextInt();
            
           
            
            int[] a = new int[n];
            int[] b = new int[n - 1];
            
            for (int i = 0; i < n - 1; i++) {
                b[i] = my.nextInt();
            }
            
            if (n >= 3) {
                int initial = (Math.abs(b[n - 2] - b[n - 3]) == 0) ? 
                              (b[n - 2] == 0 ? 0 : b[n - 2] / 2) : 
                              Math.abs(b[n - 2] - b[n - 3]);
                
                for (int i = n - 2; i >= 0; i--) {
                    initial = Math.abs(b[i] - initial);
                }
                
                a[0] = initial;
                for (int i = 0; i < n - 1; i++) {
                    a[i + 1] = Math.abs(b[i] - initial);
                    initial = b[i] - initial;
                }
            } else {
                // Simple case for n = 2
                
                a[0] = b[0]/2;
                a[1] = Math.abs(b[0]-a[0]);
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

	}
}
