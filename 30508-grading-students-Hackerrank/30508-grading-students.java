import java.io.*;
import java.util.*;

public class Solution {

    public static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];
        
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            
            // No rounding if grade < 38
            if (grade < 38) {
                result[i] = grade;
            } else {
                // Find next multiple of 5
                int nextMultiple = (int)(Math.ceil(grade / 5.0) * 5);
                
                // Round up if difference is less than 3
                if (nextMultiple - grade < 3) {
                    result[i] = nextMultiple;
                } else {
                    result[i] = grade;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }
        
        int[] result = gradingStudents(grades);
        
        for (int grade : result) {
            System.out.println(grade);
        }
    }
}
