import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<student> studentsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1- Add Student\n2- Remove Student\n3- Print All Students\n4- Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.next();

                    System.out.print("Enter student id: ");
                    int id = input.nextInt();

                    System.out.print("Enter student grade: ");
                    double grade = input.nextDouble();

                    student student = new student(name, id, grade);
                    studentsList.add(student);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter student id: ");
                    int studentId = input.nextInt();

                    for (student s : studentsList) {
                        if (s.getId() == studentId) {
                            studentsList.remove(s);
                            System.out.println("Student removed successfully.");
                            break;
                        }
                    }

                    break;

                case 3:
                    System.out.println("All Students:");
                    for (student s : studentsList) {
                        System.out.println("Name: " + s.getName() + ", ID: " + s.getId() + ", Grade: " + s.getGrade());
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
