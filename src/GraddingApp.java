import java.util.Scanner;

public class GraddingApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id: ");
        String studentID = scanner.nextLine();

        System.out.println("Enter Student name: ");
        String name = scanner.nextLine();

        Student student1 = new Student(studentID, name);

        boolean addingGrades = true;
        while(addingGrades){
            System.out.println("Enter subject name (or 'done' to stop): ");
            String subject = scanner.nextLine();

            if(subject.equalsIgnoreCase("done")){
                addingGrades = false;
            }else{
                System.out.println("Enter grade for " + subject + ": ");
                double grade = Double.parseDouble(scanner.nextLine());

                Grade gradeObject = new Grade(subject, grade);
                student1.addGrade(gradeObject);
            }
        }
        System.out.println("\nStudent ID: " + student1.getStudentId());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Grades: ");
        for(Grade g : student1.getGrades()){
            System.out.println(g.getGrade() + ": " + g.getGrade());
        }
        System.out.println("Average Grade: " + student1.getAverageGrade());

        scanner.close();

    }

}
