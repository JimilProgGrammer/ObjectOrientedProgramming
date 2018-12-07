package lab5;

import java.util.*;

/**
 *
 * @author jimil
 */
public class ReverseTokens {
    
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("The calm blue sky");
        String tokens[] = new String[20];
        int i = 0;
        while(s.hasMoreTokens()) {
            tokens[i] = s.nextToken().toString();
            i++;
        }
        System.out.println("Reverse Order: ");
        for(int j = i-1; j >= 0; j--) {
            System.out.println(tokens[j]);
        }
    }
    
}
