package CodeforcesRound_1044;

import java.util.*;

public class B_Villagers {
	public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();
 
            long[] g = new long[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                g[idx] = sc.nextLong();
            }
 
            Arrays.sort(g);
			
            long ans = 0;
 
            for(int idx = n - 1 ; idx >= 0 ; idx -= 2){
 
                ans += g[idx];
            }
 
            System.out.println(ans);
        }

		sc.close();
    }
}
