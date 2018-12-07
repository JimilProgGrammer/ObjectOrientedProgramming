package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Exercise 1 - Program 2: Find stats on grades on n students
 * 
 * @author students
 *
 */
public class GradesStatistics {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		float sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students");
		int num = Integer.parseInt(br.readLine());
		float grades[] = new float[num];
		for(int i = 0; i < num; i++) {
			System.out.println("Enter grades for student " + (i+1));
			grades[i] = Float.parseFloat(br.readLine());
			sum += grades[i];
		}
		System.out.println("Average Grades = " + (sum/(float)num));
		Arrays.sort(grades);
		if(num%2 == 0) {
			float x = grades[num/2];
			float y = grades[(num/2)+1];
			System.out.println("Median = " + (x+y)/2.00);
		} else {
			System.out.println("Median = " + grades[num+1/2]);
		}
		System.out.println("Minimum grades = " + findMin(grades));
		System.out.println("Maximum grades = " + findMax(grades));
		System.out.println("Deviation = " + findDeviation(sum/(float)num, grades));
	}
	
	public static float findMin(float arr[]) {
		float min = arr[0];
		for(float a: arr) {
			if(a < min) {
				min = a;
			}
		}
		return min;
	}
	
	public static float findMax(float arr[]) {
		float max = arr[0];
		for(float a: arr) {
			if(a > max) {
				max = a;
			}
		}
		return max;
	}
	
	public static float findDeviation(float avg, float grades[]) {
		float dev[] = new float[grades.length];
		int i = 0;
		float sum = 0;
		for(float x: grades) {
			dev[i] = grades[i] - avg;
			sum += (float)Math.pow(dev[i],2);
			i++;
		}
		return (float)Math.sqrt(sum/(float)grades.length);
	}

}
