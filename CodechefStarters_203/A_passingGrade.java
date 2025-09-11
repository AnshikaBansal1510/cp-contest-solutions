package CodechefStarters_203;

import java.util.Scanner;

public class A_passingGrade {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] a = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        a[idx] = sc.nextInt();
		    }
		    
		    int pass = 0;
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        if(a[idx] >= a[0])  pass++;
		    }
		    
		    System.out.println(pass);
		}

		sc.close();
	}
}
