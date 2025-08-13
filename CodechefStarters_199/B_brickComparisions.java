package CodechefStarters_199;

import java.util.*;

public class B_brickComparisions {
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
		    
		    int ansValue = a[0];
		    int ansIndex = 0;
		    
		    for(int idx = 1 ; idx < n ; idx++){
		        
		        if(ansValue < a[idx]){
		            
		            ansValue = a[idx];
		            ansIndex = idx;
		        }
		    }
		    
		    System.out.println(ansIndex + 1);
		}

		sc.close();
	}
}
