package CodeforcesRound_1050;

import java.util.Scanner;

public class B_lasers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt(), m = sc.nextInt();
            long x = sc.nextLong(), y = sc.nextLong();
 
            long[] a = new long[n];
            long[] b = new long[m];
			
            long cnt = 0;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextLong();
                if(a[idx] <= y)     cnt++;
            }
 
            for(int idx = 0 ; idx < m ; idx++){
 
                b[idx] = sc.nextLong();
                if(b[idx] <= x)     cnt++;
            }
 
            System.out.println(cnt);
		}

		sc.close();
	}
}
