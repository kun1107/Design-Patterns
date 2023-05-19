package factoryDesignPattern.Course;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    List<Modules> modulesList = new ArrayList<>();

    public Course() {
        this.createCourse();
    }
    public void createCourse(){}

    public List<Modules> getModulesList() {
        return modulesList;
    }
}
