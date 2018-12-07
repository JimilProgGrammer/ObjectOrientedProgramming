package lab4;

import java.util.Arrays;

public class Student {

	private int id;
	private Contacts contact[] = new Contacts[2];
	private Address address = new Address();
	
	Student(int id, Contacts contact[], Address address) {
		this.id = id;
		this.contact = contact;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", contact=" + Arrays.toString(contact)
				+ ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + Arrays.hashCode(contact);
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (!Arrays.equals(contact, other.contact))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
