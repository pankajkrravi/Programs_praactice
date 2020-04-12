
public class mainRunner {
	public static void main(String[] args) {
   Employee employeePankaj=new Employee(1, "Pankaj", "Pernament");
   Employee employeetest=new Employee(1, "ravi", "Test");
   employeePankaj.CalculateBonus(4000);
   System.out.println(employeePankaj);
   employeetest.CalculateBonus(2000);
   System.out.println(employeetest);
	}

}
