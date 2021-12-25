import java.util.ArrayList;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		
		
		
		List<EmployeeList> emplist = new ArrayList<>();
		
		emplist.add(new EmployeeList("jane","vvv",123));
		emplist.add(new EmployeeList("jag","rrr",1));
		
		emplist.add(new EmployeeList("rr","pp",3));
		
		emplist.add(new EmployeeList("jj","opoo",333));
		
		for(Object x: emplist) {
			System.out.println(x);
			
		}
		System.out.println("----------------");
		System.out.println(emplist.get(1));
		System.out.println(emplist.isEmpty());
		System.out.println("---------------------");
		emplist.set(1, new EmployeeList("parwinder","Singh",1989));   // set to replace the item in list
		
		for(Object x: emplist) {
			System.out.println(x);
			
		}
		System.out.println(emplist.size());
		
		emplist.add(3, new EmployeeList("jaspreet","kaur",1990));
		emplist.forEach(employee ->System.out.println(employee));
		
		//System.out.println(EmployeeList.contains("jj","opoo",333));
	    emplist.remove(2);
	    System.out.println("after remove");
	    emplist.forEach(employee ->System.out.println(employee));
	}
}
