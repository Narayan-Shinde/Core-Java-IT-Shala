package classComponents.methods.courseApp;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    public void addCourse(){
        courseDao.addCourse();
    }
    public void editCourse(){
        courseDao.editCourse();
    }
    public void deleteCourse(){
        courseDao.deleteCourse();
    }
}
