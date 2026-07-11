// package src;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager{
    Scanner sc = new Scanner(System.in);
    ArrayList <Student> Students = new ArrayList<>();

    public void addStudent(){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student NAME: ");
        String name = sc.nextLine();

        System.out.print("Enter Student AGE: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student COURSE: ");
        String course = sc.nextLine();

        Student student = new Student(id, name, age, course);
        Students.add(student);
        System.out.print("Student added successfully. ");
    }

    public void viewStudents(){
        if(Students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        //print all the data
        for(int i=0; i<Students.size(); i++){
            System.out.println(Students.get(i));
        }
    }

    public void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < Students.size(); i++) {

            if (Students.get(i).get_id() == id) {
                System.out.println("\nStudent Found!");
                System.out.println(Students.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent() {

        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < Students.size(); i++) {

            if (Students.get(i).get_id() == id) {

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                String course = sc.nextLine();

                Students.get(i).set_name(name);
                Students.get(i).set_age(age);
                Students.get(i).set_course(course);

                System.out.println("Student updated successfully.");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(){
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
//        sc.nextLine();
        boolean found = false;
        for(int i=0; i<Students.size(); i++){
            if(Students.get(i).get_id() == id){
                Students.remove(i);
                System.out.println("Student deleted successfully");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found");
        }
    }
}


