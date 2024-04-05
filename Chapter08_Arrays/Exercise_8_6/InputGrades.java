import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter ID for student #" + (i + 1));
            int stuID = scanner.nextInt();
            students[i].setStuID(stuID);

            for (int j = 0; j < 5; j++) {
                CollegeCourse course = new CollegeCourse();

                System.out.println("For student #" + (i + 1) + ", enter course #" + (j + 1));
                scanner.nextLine(); // Consume newline
                System.out.print("Enter course ID: ");
                String courseID = scanner.nextLine();
                course.setCourseID(courseID);

                System.out.print("Enter credits for course #" + (j + 1) + ": ");
                int credits = scanner.nextInt();
                course.setCredits(credits);

                char grade;
                do {
                    System.out.print("Enter grade for course #" + (j + 1) + " (A, B, C, D, or F): ");
                    grade = scanner.next().charAt(0);
                } while (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F');
                course.setGrade(grade);

                students[i].setCourse(course, j);
            }
        }

        // Printing student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + " ID: " + students[i].getStuID());
            for (int j = 0; j < 5; j++) {
                CollegeCourse course = students[i].getCourse(j);
                System.out.println("Course #" + (j + 1) + ": " + course.getCourseID() +
                        ", Credits: " + course.getCredits() + ", Grade: " + course.getGrade());
            }
            System.out.println();
        }
    }
}
