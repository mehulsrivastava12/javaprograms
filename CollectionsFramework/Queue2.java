
package CollectionsFramework;
import java.util.*;

class Queue2 {

	public static void main(String args[])
	{
		Queue<Integer> ll
			= new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(15);

		System.out.println(ll.peek());

		System.out.println(ll.poll());

		System.out.println(ll.peek());
	}
}
