import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList<Grade> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(Grade grade){
        this.grades.add(grade);
    }
    public double getAverageGrade(){
        double total = 0;
        for(Grade grade : grades){
            total += grade.getGrade();
        }
        return grades.size() > 0 ? total / grades.size() : 0.0;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
}
