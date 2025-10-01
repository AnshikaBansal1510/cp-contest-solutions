package CodechefStarters_206;

import java.util.*;

public class A_expensiveBuying {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    List<Integer> arr = new ArrayList<>();
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        arr.add(sc.nextInt());
		    }
		    
		    Collections.sort(arr, Collections.reverseOrder());
		    
		    long res = 0;
		    
		    for(int idx = 0 ; idx < k ; idx++){
		        
		        res += arr.get(idx);
		    }
		    
		    System.out.println(res);
		}

		sc.close();
	}
}
