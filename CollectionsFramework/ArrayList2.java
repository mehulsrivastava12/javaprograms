package CollectionsFramework;



import java.util.Scanner;
import java.util.*;

class ArrayList2 {
	
	public static void main(String[] args)
	{
        int n = 5;
		Scanner s=new Scanner(System.in);
		List<Integer> arrli = new ArrayList<Integer>(n);

	
		for (int i = 1; i <= n; i++){
			arrli.add(s.nextInt());
        }
		System.out.println(arrli);

		arrli.remove(3);

		System.out.println(arrli);

		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}

