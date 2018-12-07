class Person {
	private String name;
	private int age;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class GetterSetter {
	public static void main(String args[]) throws Exception {
		System.out.println("Creating first person");
		Person p1 = new Person();
		p1.setName("Jimil");
		p1.setAge(19);
		System.out.println("Person 1 Name : " + p1.getName());
		System.out.println("Person 1 Age : " + p1.getAge());
	}
}
