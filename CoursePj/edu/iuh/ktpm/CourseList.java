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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CourseList {
    private List<Course> courseList;

    public CourseList(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        }
        this.courseList = new ArrayList<>(n);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    /**
     * Add a course to the list
     * If the course already exists, print an error message and return false
     * @param course
     * @return true if the course is added successfully, false otherwise
     * @throws IllegalArgumentException if the course is null
     */
    public boolean addCourse(Course course) {
        if (course == null) {
            return false;
        }
        for (Course c : courseList) {
            if (c.getId().equals(course.getId())) {
                System.out.println("Course with id " + course.getId() + " already exists");
                return false;
            }
        }
        courseList.add(course);
        return true;
    }

    /**
     * Remove a course from the list
     * @param id
     * @return true if the course is removed successfully, false otherwise
     */
    public boolean removeCourse(String id) {
        for (Course c : courseList) {
            if (c.getId().equals(id)) {
                courseList.remove(c);
                return true;
            }
        }
        System.out.println("Course with id " + id + " does not exist");
        return false;
    }

    /**
     * Search for a course by ID
     * @param id
     * @return the course with the given ID if it exists, an error message otherwise
     */
    public String searchCourse(String id) {
        for (Course c : courseList) {
            if (c.getId().equals(id)) {
                return c.toString();
            }
        }
        return "Course with id " + id + " does not exist";
    }

    /**
     * Find the department with the most courses
     * @return the department with the most courses
     */

    public String findDepartmentWithMostCourses() {
        Map<String, Integer> departmentCount = new HashMap<>();
        for (Course c : courseList) {
            departmentCount.put(c.getDepartment(), departmentCount.getOrDefault(c.getDepartment(), 0) + 1);
        }

        String departmentWithMostCourses = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : departmentCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                departmentWithMostCourses = entry.getKey();
            }
        }

        return departmentWithMostCourses != null ? "Department with most courses: " + departmentWithMostCourses : "No courses found";
    }

    /**
     * Search for courses by department
     * @param department
     * @return a list of courses in the given department
     */
    public String searchCourseByDepartment (String department) {
        StringBuilder sb = new StringBuilder();
        for (Course c : courseList) {
            if (c.getDepartment().equals(department)) {
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Search for courses by name
     * @param nameCourse
     * @return a list of courses with the given name
     */
    public String searchCourseByNameCourse(String nameCourse) {
        StringBuilder sb = new StringBuilder();
        for (Course c : courseList) {
            if (c.getTitle().equals(nameCourse)) {
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Search for courses with the maximum credit
     * @return a list of courses with the maximum credit
     */
    public String searchCourseByMaxCredit() {
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (Course c : courseList) {
            if (c.getCredit() > max) {
                max = c.getCredit();
            }
        }
        for (Course c : courseList) {
            if (c.getCredit() == max) {
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Sort courses by name
     * @return a list of courses sorted by name
     */
    public String sortCourseByName() {
        List<Course> sortedList = new ArrayList<>(courseList);
        sortedList.sort((c1, c2) -> c1.getTitle().compareTo(c2.getTitle()));
        StringBuilder sb = new StringBuilder();
        for (Course c : sortedList) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}
