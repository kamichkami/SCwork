package compositePattern;

public interface Employee {

	public void addEmployee(Employee employee);

	public void removeEmployee(Employee employee);

	public Employee getChild(int i);

	public String getName();

	public double getSalary();

	public void print();

}
