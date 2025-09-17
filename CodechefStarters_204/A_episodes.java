package CodechefStarters_204;

import java.util.Scanner;

public class A_episodes {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int time = n * k;
		    
		    int hours = time / 60;
		    int mins = time % 60;
		    
		    System.out.println(hours + " " + mins);
		}

		sc.close();
	}
}
