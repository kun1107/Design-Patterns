package factoryDesignPattern.Course;

public class CourseFactory {

    public Course courseType(String courseType){

        switch (courseType){
            case("HLD"):
                return new HLD();
            case("LLD"):
                return new LLD();
            default:
                return null;
        }
    }
}
