package CodeforcesRound_1042;

import java.util.*;

public class A_lever{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();   
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
            }
 
            for(int idx = 0 ; idx < n ; idx++){
 
                b[idx] = sc.nextInt();
            }
            
            int ans = 0;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                if(a[idx] > b[idx]){
 
                    ans += Math.abs(a[idx] - b[idx]);
                }
            }
 
            System.out.println(ans + 1);
		}	

		sc.close();
	}
}