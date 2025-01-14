package classComponents.methods.courseApp;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse();
        courseController.editCourse();
        courseController.deleteCourse();
    }
}
