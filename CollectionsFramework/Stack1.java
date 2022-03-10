package CollectionsFramework;

import java.util.*;
public class Stack1 {
	

	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Visual");
		stack.push("Studio");
		stack.push("Code");
		stack.push("Visual");

		Iterator<String> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
