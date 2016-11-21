package compositePattern;

public class Developer implements Employee {
       
	private String name;
	private double salary;
	
	
	public Developer(String name ,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
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
		  System.out.println("-------------");
		    System.out.println("Name ="+getName());
		    System.out.println("Salary ="+getSalary());
		    System.out.println("-------------");
		
	}
	
	

}
