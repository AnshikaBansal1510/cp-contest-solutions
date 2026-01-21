package CodechefStarters_222;

import java.util.Scanner;

public class C_sortingPrefixes {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] arr = new int[n + 1];
		    
		    for(int idx = 1 ; idx <= n ; idx++){
		        
		        arr[idx] = sc.nextInt();
		    }
		    
		    int index = -1;
		    
		    for(int idx = n ; idx >= 1 ; idx--){
		        
		        if(arr[idx] != idx){
		            
		            index = idx;
		            break;
		        }
		    }
		    
		    if(index == -1)     System.out.println(0);
		    else{
		        
		        int res = (int) 1e9;
		        
		        for(int idx = index ; idx <= n ; idx++){
		            
		            res = Math.min(res, arr[idx]);
		        }
		        
		        System.out.println(res);
		    }
		}
	}
}
