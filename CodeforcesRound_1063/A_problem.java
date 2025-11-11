package CodeforcesRound_1063;

import java.util.*;

public class A_problem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++)      a[idx] = sc.nextInt();
 
            Arrays.sort(a);
 
            boolean possible = true;
 
            for(int idx = 0 ; idx < n - 1 ; idx++){
 
                if(idx % 2 == 1){
 
                    if(a[idx] != a[idx + 1]){
 
                        possible = false;
                        break;
                    }
                }
            }
 
            if(possible == true)    System.out.println("YES");
            else                    System.out.println("NO");
        }
	}
}
