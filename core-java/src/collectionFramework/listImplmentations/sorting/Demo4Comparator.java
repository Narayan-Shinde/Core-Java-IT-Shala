package collectionFramework.listImplmentations.sorting;

import collectionFramework.listImplmentations.customObjects.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo4Comparator {
    public static void main(String[] args) {
        Course course1 = new Course(2, "Backend Java", "Core Java, Ad.Java, Framework", "6 months", 99);
        Course course2 = new Course(1, "Full Stack Java", "Core Java, Ad.Java, Framework, Html, SQL", "6 months", 199);
        Course course3 = new Course(4, "Backend Python", "Core Python, Ad.Python, Framework", "4 months", 99);
        Course course4 = new Course(3, "Fullstack Python", "Core Python, Ad.Java, Framework", "6 months", 199);
        Course course5 = new Course(5, "Mern Stack", "HTML, CSS, JS, React", "6 months", 199);

        List<Course> courseList = new ArrayList<>();

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);

        System.out.println("*************** before sorting ****************");
        courseList.forEach(System.out::println);

        //sorting
        /*Comparator<Course> courseComparatorById = new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getId() - c2.getId();
            }
        };*/
        Comparator<Course> courseComparatorById = (c1, c2) -> c1.getId() - c2.getId();
        Comparator<Course> courseComparatorByName = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Comparator<Course> courseComparatorByFees = (c1, c2) -> c1.getFees()- c2.getFees();

        Collections.sort(courseList,courseComparatorByFees);

        System.out.println("*************** after sorting ****************");
        courseList.forEach(System.out::println);

    }
}
