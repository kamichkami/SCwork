package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private double salary;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void removeEmployee(Employee employee) {
		employees.remove(employee);

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return employees.get(i);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

		System.out.println("-------------");
		System.out.println("Name ="+getName());
		System.out.println("Salary ="+getSalary());
		System.out.println("-------------");

		Iterator<Employee> iteratoremployee= employees.iterator();
		while(iteratoremployee.hasNext()){
			Employee employee = iteratoremployee.next();
			employee.print();
		}

	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);

	}

}
