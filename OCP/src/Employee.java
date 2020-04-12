
public class Employee {

	int id;
	String name;
	String emptype;
	double salary;

	public Employee(int id, String name, String emptype) {
		this.id = id;
		this.name = name;
		this.emptype = emptype;
	}

	double CalculateBonus(double salary) {
		if (this.emptype == "Permanent")
			return salary * 10 / 100;
		else
			return salary * 5 / 100;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emptype=" + emptype + ", salary=" + salary + "]";
	}

	

}
