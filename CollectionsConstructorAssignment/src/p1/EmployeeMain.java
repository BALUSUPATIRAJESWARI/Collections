package p1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(3, "active");
		//System.out.println(emp.getDesignation());
		//System.out.println(emp.getBasicSalary(emp.getDesignation()));
		Employee emp1 = new Employee("Raji  ", 'M');
		System.out.print(emp1.getEmpName());
		System.out.println(emp1.getEmpGender());
		
		System.out.print(emp.promoteEmp(emp.getDesignation()));
		System.out.print("  ");
		System.out.println(emp.promoteEmp2(emp.getDesignation(), emp.getBasicSalary(emp.getDesignation())));
		Employee emp2 = new Employee("Ramesh  ", 'M');
		Employee emp3 = new Employee("Suesh  ", 'M');
		Employee emp4 = new Employee("Harsh", 'M', 4, "ITA", 11000, "Active");
        emp4.applyForLWP(emp4);
        
        System.out.println(emp4);
	}

}