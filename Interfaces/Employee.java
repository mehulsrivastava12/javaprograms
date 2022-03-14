package Interfaces;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee{

	String Name;
	int Age;

	public Employee(String Name, Integer Age)
	{

		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name; 
	}

	public void setName(String Name) { 
		this.Name = Name; 
	}

	public Integer getAge() { 
		return Age; 
	}

	public void setAge(Integer Age) { 
		this.Age = Age; 
	}


	public String toString()
	{
		return "Customer{"
			+ "Name=" + Name + ", Age=" + Age + '}';
	}

	static class CustomerSortingComparator
		implements Comparator<Employee> {


		public int compare(Employee customer1,
						Employee customer2)
		{

			int NameCompare = customer1.getName().compareTo(
				customer2.getName());

			int AgeCompare = customer1.getAge().compareTo(
				customer2.getAge());

			return (NameCompare == 0) ? AgeCompare
									: NameCompare;
		}
	}

	public static void main(String[] args)
	{

		List<Employee> al = new ArrayList<>();

		Employee obj1 = new Employee("Ajay", 27);
		Employee obj2 = new Employee("Sneha", 23);
		Employee obj3 = new Employee("Simran", 37);
		Employee obj4 = new Employee("Ajay", 22);
		Employee obj5 = new Employee("Ajay", 29);
		Employee obj6 = new Employee("Sneha", 22);

		al.add(obj1);
		al.add(obj2);
		al.add(obj3); 
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		Iterator<Employee> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");

		while (custIterator.hasNext()) {

			System.out.println(custIterator.next());
		}

		Collections.sort(al,
						new CustomerSortingComparator());

		System.out.println("\n\nAfter Sorting:\n");

		for (Employee customer : al) {
			System.out.println(customer);
		}
	}
}


