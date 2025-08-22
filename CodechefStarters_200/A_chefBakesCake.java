package CodechefStarters_200;

import java.util.*;

public class A_chefBakesCake {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		
		int num_cakes = y / x;
		
		int min_vehicles = (n + num_cakes - 1) / num_cakes;
		
		System.out.println(min_vehicles);

		sc.close();
	}
}
