package CodechefStarters_201;

import java.util.*;

public class A_mixingLiquids {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int a = sc.nextInt(), b = sc.nextInt();
		    
		    int juice = b / 2;
		    
		    if(juice >= a){
		        
		        System.out.println(a * 3);
		    }
		    
		    else{
		        
		        System.out.println(juice * 3);
		    }
		}

		sc.close();
	}
}
