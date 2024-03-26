import java.util.ArrayList;
import java.util.Scanner;

class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private String studentID;
    private String name;
    private ArrayList<Course> courses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void displayRegisteredCourses() {
        System.out.println("Registered Courses for Student " + studentID + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName());
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> availableCourses = new ArrayList<>();
        availableCourses.add(new Course("CS101", "Introduction to Computer Science"));
        availableCourses.add(new Course("MATH201", "Calculus"));
        availableCourses.add(new Course("ENG101", "English Composition"));

        System.out.println("Welcome to the Course Registration System!");

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentID, studentName);

        while (true) {
            System.out.println("\nAvailable Courses:");
            for (Course course : availableCourses) {
                System.out.println(course.getCourseCode() + " - " + course.getCourseName());
            }

            System.out.print("\nEnter course code to register (or 'done' to finish): ");
            String courseCode = scanner.nextLine();

            if (courseCode.equalsIgnoreCase("done")) {
                break;
            }

            boolean courseFound = false;
            for (Course course : availableCourses) {
                if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                    student.registerCourse(course);
                    availableCourses.remove(course);
                    courseFound = true;
                    break;
                }
            }

            if (!courseFound) {
                System.out.println("Course not found. Please enter a valid course code.");
            }
        }

        student.displayRegisteredCourses();

        scanner.close();
    }
}
