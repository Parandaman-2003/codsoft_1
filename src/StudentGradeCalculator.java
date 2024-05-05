import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your subject marks :");
        int total_no_of_subjects = 5;

        System.out.print("English : ");
        int english = scanner.nextInt();
        System.out.print("Biology : ");
        int biology = scanner.nextInt();
        System.out.print("Mathematics : ");
        int mathematics = scanner.nextInt();
        System.out.print("Physics : ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry : ");
        int chemistry = scanner.nextInt();

        int total_marks = english+biology+mathematics+physics+chemistry;
        System.out.println("Total marks is :"+total_marks);

        int average_percentage = total_marks / total_no_of_subjects;
        System.out.println("Student average percentage is :"+average_percentage);

        if (average_percentage >= 90)
            System.out.println("Your grade is O");
        else if (average_percentage >= 80)
            System.out.println("Your grade is A+");
        else if (average_percentage >= 70)
            System.out.println("Your grade is A");
        else if (average_percentage >= 60)
            System.out.println("Your grade is B+");
        else if (average_percentage >= 50)
            System.out.println("Your grade is B");
        else
            System.out.println("Your grade is U");
    }
}
