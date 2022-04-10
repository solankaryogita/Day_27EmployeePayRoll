package employeePayRollService;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import employeepayroll.EmployeePayrollData;
import employeepayroll.EmployeePayrollService;

public class EmployeePayrollServiceTest {
	 @Test
	    public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
	        EmployeePayrollData[] arrayOfEmployees = {
	                new EmployeePayrollData(1, "Dolly", 100000.0),
	                new EmployeePayrollData(2, "Alok", 200000.0),
	                new EmployeePayrollData(3, "Max", 300000.0)
	        };
	        EmployeePayrollService employeePayrollService;
	        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
	        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);

	        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
	        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
	        Assert.assertEquals(12, entries);

	    }

	    @Test
	    public void givenFile_WhenRead_ShouldReturnNumberOfEntries() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        long entries = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
	        Assert.assertEquals(12, entries);
	    }


}
