public class Mainclass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Sana", 96.36);
        Student student2 = new Student(2, "Yana", 84.7);
        System.out.println(student1.getStudentId() + " ");
        System.out.println(student1.getName() + " ");
        System.out.println(student1.getGrade() + " ");
        System.out.println();
        System.out.println(student2.getStudentId() + " ");
        System.out.println(student2.getName() + " ");
        System.out.println(student2.getGrade() + " ");
        System.out.println();
    }
}
