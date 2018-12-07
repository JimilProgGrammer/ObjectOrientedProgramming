package lab6;

/**
 * POJO class for employee
 * 
 * @author jimil
 */
public class Employee {
   
    private String name;
    private String contacts[];
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", contacts=" + contacts + ", email=" + email + '}';
    }
    
}
