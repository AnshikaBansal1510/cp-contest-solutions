package CodechefStarters_202;

import java.util.Scanner;

public class A_endlessPlay {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), h = sc.nextInt();
		
		int diff = (x - 4);
		
		System.out.println((diff * 24) + h);

		sc.close();
	}
}
