package CodechefStarters_211;

import java.util.*;

public class C_noDoubling {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    ArrayList<Integer> a = new ArrayList<>();
		    
		    for(int idx = 0 ; idx < n ; idx++)  a.add(sc.nextInt());
		    
		    Collections.sort(a, Collections.reverseOrder());
		    
		    if(a.size() > 2 && a.get(0).equals(a.get(1))){
		        
		        int temp = a.get(a.size() - 1);
		        a.set(a.size() - 1, a.get(1));
		        a.set(1, temp);
		    }
		    
		    for(int idx = 0 ; idx < a.size() ; idx++){
		        
		        System.out.print(a.get(idx) + " ");
		    }
		    
		    System.out.println("");
		}

		sc.close();
	}
}
