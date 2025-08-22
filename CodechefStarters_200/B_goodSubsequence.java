package CodechefStarters_200;

import java.util.*;

public class B_goodSubsequence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        a[idx] = sc.nextInt();
		    }
		    
		    int maxLen = 1;
		    int prev_parity = (a[0] % 2);    // odd - 1, even - 0
		    
		    for(int idx = 1 ; idx < n ; idx++){
		        
		        if(a[idx] % 2 != prev_parity){
		            
		            maxLen++;
		            prev_parity = (a[idx] % 2);
		        }
		    }
		    
		    System.out.println(maxLen);
		}

		sc.close();
	}
}
