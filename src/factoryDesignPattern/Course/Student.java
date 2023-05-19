package factoryDesignPattern.Course;

public class Student {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();

        Course hld = courseFactory.courseType("HLD");
        Course lld = courseFactory.courseType("LLD");
        System.out.println(hld.modulesList);
        System.out.println(lld.modulesList);

    }
}
