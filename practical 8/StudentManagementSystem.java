import java.util.Scanner;

class StudentManagementSystem {

    static void printTask(){
        System.out.println("1 -> to add student.");
        System.out.println("2. Display Students");
        System.out.println("3. Exit");
    }

    static {
        System.out.println("-----Welcome to SGGS Student Management System-----");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Hey manager enter your name:");
        String managerName=input.nextLine();
        Manager m1=new Manager(managerName);
        System.out.println("Which task u have to perform Mr."+m1.managerName);
//        boolean isRun=true;
        while(true){
            printTask();
            System.out.print("Enter your choice:");
            int choice=input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:

                        System.out.print("Enter your name:");
                        String studentName=input.nextLine();

                        System.out.print("Enter your adddress:");
                        String address=input.nextLine();

                        System.out.print("Enter your mobile No:");
                        long mobNo=input.nextLong();
                        input.nextLine();

                        System.out.print("enter your reg no:");
                        String regNo= input.nextLine();

                        Student s=new Student(studentName, address,mobNo,regNo) ;
                        m1.addStudent(s);
                        break;
                case 2:
                    m1.displayStudent();
                    break;
                case 3:
                    System.out.println("exiting the program.");
                    return;

                default:
                    System.out.println("invalid input.");
            }

        }
    }



}