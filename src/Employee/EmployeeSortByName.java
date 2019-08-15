package Employee;
import java.util.Comparator;
 
// sort by name
class EmployeeSortByName implements Comparator  {
    public int compare(Employee emp1, Employee emp2) {
        return emp1.empName.compareTo(emp2.empName);
    }

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}