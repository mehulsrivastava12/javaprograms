package CollectionsFramework;


import java.util.*;

public class Queue1 {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Gagan");
		pq.add("Farahn");
		pq.add("Aman");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}

