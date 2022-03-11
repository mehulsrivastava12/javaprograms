package EdabitHardLevelChallenges;

import java.util.Scanner;

public class DIsariumNumber {

	static boolean check(int n)
	{
		int count_digits = Integer.toString(n).length();
		int sum = 0; 
		int x = n;
		while (x!=0)
		{
			int r = x%10;
	
			sum = (int) (sum + Math.pow(r, count_digits--));
			x = x/10;
		}
	
		return (sum == n);
	}
	
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
	}
}

