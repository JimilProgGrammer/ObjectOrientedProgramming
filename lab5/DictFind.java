package lab5;

/**
 *
 * @author jimil
 */
public class DictFind {

    public static void main(String[] args) {
        String s = "catsanddogs";
        String temp= "";
        boolean flag = false;
        String dict[] = {"cats","and","dogs"};
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            temp += c;
            for(String x: dict) {
                if(temp.equals(x)) {
                    flag = true;
                    System.out.println(temp + " is a part of the dictionary");
                    temp = "";
                }
            }
        }
    }
    
}
