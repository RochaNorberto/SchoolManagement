import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException{

        ArrayList <Teacher> teacherList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        School school = new School(teacherList,studentList);

        Scanner input = new Scanner(System.in);
        int option = 1;
        int idTeacher = 0;
        int idStudent = 0 ;
        while(option != 0 ){
            System.out.println("--- School Management System ---");
            System.out.println("1 - Add a new Teacher to the School");
            System.out.println("2 - Add a new Student ot the School");
            System.out.println("3 - View Teachers in School");
            System.out.println("4 - View Students in School");
            System.out.println("5 - View Financial Statistics");
            System.out.println("0 - Exit");
            option = input.nextInt();
            switch(option){
                case 1:// calls method to create a teacher
                    createTeacher(teacherList,idTeacher,school);
                    System.out.println("The School is spenting now " + School.getTotalMoneySpent() + "$ a month");
                    idTeacher++;
                    break;
                case 2:// calls method to create a student
                    createStudent(studentList,idStudent,school);
                    System.out.println("The School has " + studentList.size() +  " students");
                    idStudent++;
                    break;
                case 3:// calls method to view every teacher in the school
                    System.out.println("Theres a total of "  + teacherList.size() + " Teachers in the school..");
                    for (int i = 0; i < teacherList.size();i++){
                        System.out.println("--- LIST OF TEACHERS ---");
                        System.out.println("Teacher " + (i+1) + " :" + teacherList.get(i).getName());

                    }
                    break;
                case 4: //  calls method to view every student in the school
                    System.out.println("Theres a total of "  + studentList.size() + " Students in the school");
                    System.out.println("--- LIST OF STUDENTS ---");
                    for (int i = 0; i < studentList.size();i++){
                        System.out.println("Student " + (i+1) + " :" + studentList.get(i).getName());

                    }
                    break;
                case 5:
                    System.out.println("--- Financial Report ---\n" );
                    System.out.println("Mensal Income: " + school.getTotalMoneyEarned());
                    System.out.println("Mensal Payments: " + school.getTotalMoneySpent());
            }

        }
    }

    public static  void createTeacher(ArrayList list,int id,School school){
        Scanner s = new Scanner(System.in);
        System.out.println("Teacher's name:");
        String name = s.nextLine();
        System.out.println("Teacher's income:");
        int salary = s.nextInt();
        Teacher teacher = new Teacher(id,name,salary);
        list.add(teacher);
        school.updateTotalMoneySpent(salary);
    }
    public static void createStudent(ArrayList list, int id, School school){
        int firstPayment = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Student's name:");
        String name = s.nextLine();
        System.out.println("Student's grade:");
        int grade = s.nextInt();
        Student student = new Student(id,name,grade);
        while (firstPayment == 0 || firstPayment<0 || firstPayment>30000){
            System.out.println("Your first Fee payment: ");
            firstPayment = s.nextInt();
        }
        student.payFees(firstPayment);
        list.add(student);

    }



}
