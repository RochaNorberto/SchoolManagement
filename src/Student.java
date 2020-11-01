/*Responsable for keeping track of
students fees, names, grades and fees paid
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private static int feesPaid;
    private static int feesTotal;

    /**
     *Every student has 30,000$ in fees total
     * Fees paid start at 0$
     * @param id : unique
     * @param name: name of the student
     * @param grade: grade of the student
     */


    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;

    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade){
        this.grade= grade;
    }

    /**
     * Keep adding the fees to feesPaid field
     * Add the feews to fees paid
     * The school is going to receive the funds
     * @param fee
     */

    public static void payFees(int fee){
        feesPaid+=fee;
        feesTotal-=fee;
        School.updatetTotalMoneyEarned(fee);
    }

    @Override
    public String toString() {
        return "Student Name:" + name + "\n Total fees paid so far:" + feesPaid +"$"+ "\n Total fees remaining to conclude the loan" + feesTotal;
    }
}



