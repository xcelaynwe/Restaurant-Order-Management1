public class Student {

    private int studentId;
    private String name;
    private double grade;

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        setGrade(grade);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }
}
