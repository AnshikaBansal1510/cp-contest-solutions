package CodechefStarters_202;

import java.util.Arrays;
import java.util.Scanner;

public class C_buyingFlowers {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] dp = new int[n + 1];
		    
            Arrays.fill(dp, (int) 1e9);
            dp[0] = 0;
            
            for(int idx = 1 ; idx <= n ; idx++){
                
                if (idx >= 2 && dp[idx - 2] != (int) 1e9){
                    
                    dp[idx] = Math.min(dp[idx], dp[idx - 2] + 4);
                }
                
                if (idx >= 3 && dp[idx - 3] != (int) 1e9) {
                    
                    dp[idx] = Math.min(dp[idx], dp[idx - 3] + 5);
                }
            }
            
            System.out.println(dp[n]);
		}

		sc.close();
	}
}
