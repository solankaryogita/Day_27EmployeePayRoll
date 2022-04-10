package employeepayroll;

public class EmployeePayrollData {
	int empId;
	String empName;
	double empSalary;

	public EmployeePayrollData(Integer empId, String empName, Double empSalary) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	

}
