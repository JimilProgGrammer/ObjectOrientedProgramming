/**
 * 
 */

/**
 * @author students
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Hello Java\"Hello\""+"Byee");
        String s = "Hello Byee";
        String s1 = "Java";
        System.out.println(s+s1);
        
        char a = 'a';
        float f = 78f;
        int i = 89;
        
        int a1 = 10,b =18;
        System.out.println(a+b+s+(a+b));
        boolean result = a1==b;
        System.out.println(5>10);
        System.out.println(!(a1 == 10 || a1>b));
        
        a ++; //a = a + 1;
        System.out.println(a);
        a --;
        System.out.println("float is "+f);
        ++ b;
        System.out.println(b++);
        System.out.println(++b);
        int a2 = a++;
        System.out.println("a2 = "+a2);
        int value1 = 89;
        value1 *=5; // value1 = value1 * 5;
        a += 3;
        System.out.println("a is "+a);
        String str = a>b ? "A is grater than B": "B is grater than A";
        System.out.println(str);
        
        System.out.println(4^2);
        
        Calculator c1 = new Calculator();
        System.out.println("Division is "+c1.divide(8, 2));
	}

}
