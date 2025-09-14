package CodeforcesRound_1047;

import java.util.Scanner;

public class A_collatzConjecture {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int k = sc.nextInt();
            int x = sc.nextInt();
 
            int res = x;
 
            for(int idx = 0 ; idx < k ; idx++){
 
                res *= 2;
            }
            
            System.out.println(res);
		}

		sc.close();
	}
}
