package CodechefStarters_222;

import java.util.*;

public class D_sellUptoTwo {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        arr[idx] = sc.nextInt();
		    }
		    
		    int[][] dp = new int[n][n + 1];
		    
		    for(int[] row : dp){
		        
		        Arrays.fill(row, (int) -1e9);
		    }
		    
		    for(int ind = n - 1 ; ind >= 0 ; ind--){
		        
		        for(int w = n ; w >= 0 ; w--){
		            
		            if (ind == n - 1) {

                        int res = 0;
                        if ((w + 1) >= 1)   res = Math.max(res, arr[ind]);
                        if ((w + 1) >= 2)   res = Math.max(res, arr[ind] * 2);
                        dp[ind][w] = res;
                        continue;
                    }
		            
		            int sell0 = (int) -1e9;
		            if(w + 1 <= n)    sell0 = dp[ind + 1][w + 1];
		            int sell1 = arr[ind] + dp[ind + 1][w];
		            
		            int sell2 = (int) -1e9;
		            if(w - 1 >= 0)  sell2 = (arr[ind] * 2) + dp[ind + 1][w - 1];
		            
		            dp[ind][w] = Math.max(sell0, Math.max(sell1, sell2));
		        }
		    }
		    
		    System.out.println(dp[0][0]);
		}
	}
}
