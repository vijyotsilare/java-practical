
import java.util.ArrayList;
import java.util.Scanner;

class Manager {

    String managerName;
    Manager(String managerName){
        this.managerName=managerName;
    }

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    void displayStudent(){
        if(students.isEmpty()){
            System.out.println("no student found");
        }else{
            for(Student s:students){
              s.displayStudent();
            }
        }
    }
}


