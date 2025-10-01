package CodechefStarters_206;

import java.util.Scanner;

public class B_primeSum {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] a = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        a[idx] = sc.nextInt();
		    }
		    
		    long cnt = 0;
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        for(int jdx = idx + 1 ; jdx < n ; jdx++){
		            
		            int sum = a[idx] + a[jdx];
		            
		            if(sum == 2 || sum == 3 || sum == 5)    cnt++;
		        }
		    }
		    
		    System.out.println(cnt);
		}

		sc.close();
	}
}
