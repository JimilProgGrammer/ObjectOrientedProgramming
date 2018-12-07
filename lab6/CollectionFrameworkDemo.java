package lab6;

import java.util.*;

/**
 *
 * @author jimil
 */
public class CollectionFrameworkDemo {
    
    public static void main(String[] args) throws Exception {
        
        Employee e1 = new Employee();
        e1.setName("Jimil");
        e1.setEmail("jimil.shah@spit.ac.in");
        e1.setContacts(new String[]{"9322677561", "8879908458"});
        
        Employee e2 = new Employee();
        e2.setName("Manan");
        e2.setEmail("manan.doshi@spit.ac.in");
        e2.setContacts(new String[]{"8879903867","9325277213"});
        
        HashMap<Integer,Employee> map = new HashMap<>();
        map.put(1, e1);
        map.put(2, e2);
        
        Set<Integer> mapSet = map.keySet();
        for(Integer i: mapSet) {
            Employee obj = map.get(i);
            System.out.println("EMPLOYEE DETAILS: ");
            System.out.println("Name: " + obj.getName());
            System.out.println("Email ID: " + obj.getEmail());
            System.out.println("Contacts: ");
            for(String contact: obj.getContacts()) {
                System.out.println(contact);
            }
        }
        
    }
    
}
