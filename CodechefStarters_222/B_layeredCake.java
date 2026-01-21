package CodechefStarters_222;

import java.util.Scanner;

public class B_layeredCake {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int[] a = new int[n];
		    int[] b = new int[m];
		    
		    for(int idx = 0 ; idx < n ; idx++)  a[idx] = sc.nextInt();
		    for(int idx = 0 ; idx < m ; idx++)  b[idx] = sc.nextInt();
		    
		    int res = 0;
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        int cnt = 0;
		        
		        for(int jdx = 0 ; jdx < m ; jdx++){
		            
		            if(b[jdx] < a[idx])     cnt++;
		        }
		        
		        res += cnt;
		    }
		    
		    System.out.println(res);
		}
	}
}
