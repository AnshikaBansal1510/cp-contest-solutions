package CodeforcesRound_1050;

import java.util.*;

public class D_destructionOfFields {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            List<Long> odd = new ArrayList<>();
            List<Long> even = new ArrayList<>();
 
            long evenSum = 0;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                long x = sc.nextLong();
				
                if(x % 2 == 0){
 
                    even.add(x);
                    evenSum += x;
                } else {
 
                    odd.add(x);
                }
            }
 
            if(odd.size() == 0){
 
                System.out.println(0);
            }
 
            else if(odd.size() == 1){
 
                System.out.println(evenSum + odd.get(0));
            }
 
            else{
 
                long res = evenSum;
 
                double oddNum = Math.ceil(odd.size() / 2.0);
 
                Collections.sort(odd);
 
                for(int idx = odd.size() - 1 ; idx >= (odd.size() - oddNum) ; idx--){
 
                    res += odd.get(idx);
                }
 
                System.out.println(res);
            }
		}

		sc.close();
	}	
}
