package gradecalculator;

import java.util.*;

/**
 *
 * @author Brandon George
 * 
 * Allows for multiple ways to calculate GPA and semester grades based on 
 * information available.
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("Hello! Thank you for choosing my grade calculator."
                + " This was created by Brandon George as a side project for "
                + "my portfolio. If you have any bugs, issues, or questions "
                + "please send me an email at brandongeorge0920@gmail.com.");
        System.out.println("\nA few notes before we begin: \n 1. The grades "
                + "should be entered based on a scale of 100 (100 being a "
                + "perfect score). Please adjust your grades to be out of 100 "
                + "if they are not already or the calculation will be "
                + "incorrect. \n 2. GPA is based on a scale that can be "
                + "found at this link: https://takeyoursuccess.com/how-to-"
                + "figure-out-your-gpa-on-a-weighted-4-0-scale/ so if your "
                + "scale is different, it will not be accurate.\n 3. The "
                + "single class grade calculator will need the following "
                + "information: each grading category's percentage and either"
                + " the overall grade for each category or each assignment "
                + "grade for each category. It will give you three values back: "
                + "overall grade, letter grade, and GPA grade. \n 4. The GPA "
                + "calculator will need the letter grade, gpa grade, or actual"
                + " grade for each class you have taken or plan to take. It "
                + "will give you your overall GPA.");
        System.out.println("\nWould you like to calculate a single class grade"
                + " or overall GPA? Please Enter 1 for single class or 2 for"
                + " overall GPA: ");
        
        for (int i = 0; i < 1; i--) {
            try {
                choice = in.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter an integer, either 1 for single class grade or 2 for overall GPA: ");
                in.next();
                continue;
            }
            
            if (choice == 1) {
                System.out.println("Great! You selected 1 for single class grade.");
            } else if (choice == 2) {
                System.out.println("Great! You selected 2 for GPA calculator");
            } else {
                System.out.println("Please enter a 1 for single class grade or 2 for overall GPA: ");
                continue;
            }
        }
    }  
}
