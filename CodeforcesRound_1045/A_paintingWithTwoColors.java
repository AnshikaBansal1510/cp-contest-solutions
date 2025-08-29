package CodeforcesRound_1045;

import java.util.*;

public class A_paintingWithTwoColors {
	 public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            long n = sc.nextLong();
 
            long a = sc.nextLong();
 
            long b = sc.nextLong();
 
            if(a > b && ((n - a) % 2 == 0) && ((n - b) % 2 == 0)){
 
                System.out.println("YES");
            }
 
            else if(a <= b && ((n - b) % 2 == 0)){
 
                System.out.println("YES");
            }
 
            else{
 
                System.out.println("NO");
            }
        }

		sc.close();
    }
}
