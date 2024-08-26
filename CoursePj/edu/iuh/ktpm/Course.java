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




public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    public Course(String id, String title, int credit, String department) {
        if (id == null || id.length() < 3 || !id.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Invalid course ID");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Course title cannot be empty");
        }
        if (credit <= 0) {
            throw new IllegalArgumentException("Credit must be greater than 0");
        }
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10d %-10s", id, title, credit, department);
    }
}