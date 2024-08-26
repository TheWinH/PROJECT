/**
 * @ (#) Course.java  1.0   8/23/2024
 *
 * Copyright (c) 2024 IUH. All right reserved
 */
package edu.iuh.ktpm;
/**
 * @description : hi
 * @author : TheWinH , Thế Vinh Đào
 * @version 1.0
 * @created : 8/23/2024
 */
import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        CourseList courseList = new CourseList(10);

        Course course1 = new Course("C001", "Data Structures", 3, "CS");
        Course course2 = new Course("C002", "Algorithms", 4, "CS");
        Course course3 = new Course("C003", "Operating Systems", 3, "CS");
        courseList.addCourse(course1);
        courseList.addCourse(course2);
        courseList.addCourse(course3);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Search Course By Max Credit");
            System.out.println("5. Search Course");
            System.out.println("6. Find Department with most courses");
            System.out.println("7. Search Course by Department");
            System.out.println("8. Search Course by Name Course");
            System.out.println("9. Sort Course by Name");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCourse(courseList, sc);
                    break;
                case 2:
                    removeCourse(courseList, sc);
                    break;
                case 3:
                    displayCourses(courseList);
                    break;
                case 4:
                    searchCourseByMaxCredit(courseList);
                    break;

                case 5 :
                    searchCourse(courseList, sc);
                    break;
                    case 6:
                         findDepartmentWithMostCourses(courseList);
                         break;
                case 7:
                    searchCourseByDepartment(courseList, sc);
                    break;
                case 8:
                    searchCourseByNameCourse(courseList, sc);
                    break;
                case 9:
                    sortCourseByName(courseList);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }

    public static void addCourse(CourseList courseList, Scanner sc) {
        System.out.println("Enter course ID: ");
        String id = sc.nextLine();
        System.out.println("Enter course title: ");
        String title = sc.nextLine();
        System.out.println("Enter course credit: ");
        int credit = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter course department: ");
        String department = sc.nextLine();
        Course course = new Course(id, title, credit, department);
        courseList.addCourse(course);
    }

    public static void removeCourse(CourseList courseList, Scanner sc) {
        System.out.println("Enter course ID to remove: ");
        String id = sc.nextLine();
        courseList.removeCourse(id);
    }

    public static void displayCourses(CourseList courseList) {
        for (Course c : courseList.getCourseList()) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
    public static void searchCourse(CourseList courseList, Scanner sc) {
        System.out.println("Enter course ID to search: ");
        String id = sc.nextLine();
        System.out.println(courseList.searchCourse(id));
    }

    public static void findDepartmentWithMostCourses(CourseList courseList) {
        System.out.println(courseList.findDepartmentWithMostCourses());
    }
    public static void searchCourseByDepartment(CourseList courseList, Scanner sc){
        System.out.println("Enter the Department to search: ");
        String sb = sc.nextLine();
        System.out.println(courseList.searchCourseByDepartment(sb));

    }
    public static void searchCourseByNameCourse(CourseList courseList, Scanner sc){
        System.out.println("Enter the Course to search: ");
        String sb = sc.nextLine();
        System.out.println(courseList.searchCourseByNameCourse(sb));

    }
    public static void searchCourseByMaxCredit(CourseList courseList){
        System.out.println(courseList.searchCourseByMaxCredit());

    }
    public static void sortCourseByName(CourseList courseList){
        System.out.println(courseList.sortCourseByName());

    }
}