package CodeforcesRound_1048;

import java.util.*;

public class B_cakeCollection {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
            long m = sc.nextLong();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
            }
 
            Arrays.sort(a);
 
            long res = 0;
            int idx = n - 1;
 
            while(m > 0 && idx >= 0){
 
                res += (a[idx] * m);
                m--;
                idx--;
            }
 
            System.out.println(res);
		}

		sc.close();
	}
}
