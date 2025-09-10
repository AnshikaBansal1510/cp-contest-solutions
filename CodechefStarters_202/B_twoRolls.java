package CodechefStarters_202;

import java.util.Scanner;

public class B_twoRolls {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int req = 50 - x; 
            int min = 2 * y;
            int max = (2 * y) + 10; 
    
            if (req >= min && req <= max) {
                
                System.out.println("YES");
            } else {
                
                System.out.println("NO");
            }
		}

		sc.close();
	}
}
