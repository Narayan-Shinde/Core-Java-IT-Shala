import controller.CourseController;
import model.Course;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        //Create course
      /*  Course course = Course.builder()
                .name("Full Stack Java Development")
                .description("real time with handson")
                .duration("6 months")
                .fees(45000)
                .build();

        courseController.addCourse(course);*/

        //edit course
       /* Course course = Course.builder()
                .id(2)
                .name("Full Stack Python Development")
                .description("real time training - Balaji Sir")
                .duration("5 months")
                .fees(45000)
                .build();

        courseController.editCourse(course);*/

        //delete course
        //courseController.deleteCourse(3);

        // getById
        System.out.println("get by id");
        System.out.println(courseController.getCourseById(1));
        //get All Course
        System.out.println("all courses");
         courseController.getAllCourses().forEach(System.out::println);
    }
}
