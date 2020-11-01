import java.util.List;

public class School {
    private List<Teacher> teachers;
    private static List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Student> getStudents() {
        return students;
    }
    public static void addStudent(Student student){
        students.add(student);
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;

    }
    public static void   updatetTotalMoneyEarned(int money) {
        totalMoneyEarned = totalMoneyEarned + money;
    }



    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent+=moneySpent;
    }



    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }


}
