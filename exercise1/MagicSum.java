package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[20];
		int i = 1, ch = 0;
		do {
			System.out.println("Enter a number or enter -1 to exit:");
			ch = Integer.parseInt(br.readLine());
			if(ch != -1) {
				num[i] = ch;
			}
			i++;
		} while(ch != -1);
		int sum = printMagicSum(num);
		System.out.println("Magic Sum for the numbers you entered is " + sum);
	}
	
	public static boolean hasEight(int num) {
		String str = String.valueOf(num);
		if(str.contains("8")) {
			return true;
		}
		return false;
	}
	
	public static int printMagicSum(int num[]) {
		int sum = 0;
		for(int a: num) {
			if(hasEight(a)) {
				sum += a;
			}
		}
		return sum;
	}

}
