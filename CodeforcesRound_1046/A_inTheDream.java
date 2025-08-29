package CodeforcesRound_1046;

import java.util.*;

public class A_inTheDream {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
 
            int max = Math.max(a, b);
            int min = Math.min(a, b);
 
            int p = (max + min) / (min + 1);
            
            if(p > 2){
 
                System.out.println("NO");
                continue;
            }
 
            int a1 = (c - a);
            int b1 = (d - b);
 
            int max1 = Math.max(a1, b1);
            int min1 = Math.min(a1, b1);
 
            int p1 = (max1 + min1) / (min1 + 1);
            
            if(p1 > 2){
 
                System.out.println("NO");
                continue;
            }
 
            System.out.println("YES");
        }

        sc.close();
    }
}
