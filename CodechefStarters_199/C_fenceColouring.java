package CodechefStarters_199;

import java.util.*;

public class C_fenceColouring {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] a = new int[n];
		    HashMap<Integer, Integer> freq = new HashMap<>();
            
            for(int idx = 0; idx < n; idx++){
                a[idx] = sc.nextInt();
                freq.put(a[idx], freq.getOrDefault(a[idx], 0) + 1);
            }
            
            int max = 0;
            for(int val : freq.values()){
                max = Math.max(max, val);
            }
            
            boolean done = true;
            for(int x : a){
                
                if(x != 1){
                    done = false;
                    break;
                }
            }
            
            if(done){

                System.out.println(0);
                continue;
            }
            
            if(max == n){

                System.out.println(1);
                continue;
            }
            
            int one_freq = freq.getOrDefault(1, 0);

            if(one_freq == max){

                System.out.println(n - one_freq);
            } else {

                System.out.println(1 + (n - max));
            }    
		}

		sc.close();
	}
}
