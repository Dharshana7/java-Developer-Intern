import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < students.length) {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        sc.nextLine(); 
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Grade (A-F): ");
                        char grade = sc.next().charAt(0);

                        System.out.print("Enter Contact: ");
                        String contact = sc.next();

                        students[count] = new Student(id, name, age, grade, contact);
                        count++;

                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student list is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println(
                            "studentId\tname\tage\tgrade\tcontact\t"
                        );
                        for (int i = 0; i < count; i++) {
                            students[i].displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}