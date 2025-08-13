package CodechefStarters_199;

import java.util.*;

public class A_cakeMaking {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cnt = 0;
        
        for(int idx = 1 ; idx <= a ; idx++){
            
            for(int jdx = 1 ; jdx <= b ; jdx++){
                
                if(idx != jdx)  cnt++;
            }
        }
        
        System.out.println(cnt);
		sc.close();
	}
}
