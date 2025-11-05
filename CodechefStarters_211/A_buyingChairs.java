package CodechefStarters_211;

import java.util.Scanner;

public class A_buyingChairs {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int w = sc.nextInt();
		    int p = sc.nextInt();
		    int k = sc.nextInt();
		    
		    if(w <= k){
		        
		        System.out.println((w * 2) + (k - w));
		    }
		    
		    else{
		        
		        System.out.println(k * 2);
		    }
		}

		sc.close();
	}
}
