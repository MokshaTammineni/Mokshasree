import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        
        double totalMarks = 0;
        double totalWeightage = 0;
        
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            
            System.out.print("Enter the weightage for subject " + i + ": ");
            double weightage = scanner.nextDouble();
            
            totalMarks += marks * weightage;
            totalWeightage += weightage;
        }
        
        double average = totalMarks / totalWeightage;
        
        System.out.println("Average Grade: " + average);
        
        scanner.close();
    }
}