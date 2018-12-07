package lab4;

/**
 * Runner class to demonstrate aggregation and composition
 * 
 * @author students
 *
 */
public class StudentRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contacts contact[] = new Contacts[2];
		Contacts obj = new Contacts();
		obj.setContact("9322677561");
		obj.setType("WORK");
		Contacts obj1 = new Contacts();
		obj1.setContact("02228880190");
		obj1.setType("HOME");
		
		contact[0] = obj;
		contact[1] = obj1;
		
		Address addr = new Address();
		addr.setLine1("Some/Number Bldg.Co.Op.Soc");
		addr.setLine2("Some Lane");
		addr.setCity("Mumbai");
		
		Student s1 = new Student(1,contact,addr);
		System.out.println(s1);

	}

}
