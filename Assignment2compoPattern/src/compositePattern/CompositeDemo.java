package compositePattern;

public class CompositeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee emp1 = new Developer("Haris" ,100000);
		Employee emp2 = new Developer("ashar", 200000);
		Employee emp3 = new Developer("kamran", 200000);
		Employee manager1= new Manager("Abdullah",300000);
		manager1.addEmployee(emp1);
		manager1.addEmployee(emp2);
		
		Manager generalmanager = new Manager("Saqib", 500000);
		generalmanager.addEmployee(emp3);
		generalmanager.addEmployee(manager1);
		generalmanager.print();
		
	}

}
