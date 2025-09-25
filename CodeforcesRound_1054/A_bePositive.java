package CodeforcesRound_1054;

import java.util.Scanner;

public class A_bePositive {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
            }
 
            int min = 0, neg = 0;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                if(a[idx] == 0)     min++;
 
                if(a[idx] == -1)    neg++;
            }
 
            if(neg % 2 == 1){
 
                min += 2;
            }
 
            System.out.println(min);
		}

		sc.close();
	}
}
