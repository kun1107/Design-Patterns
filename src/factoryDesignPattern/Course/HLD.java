package factoryDesignPattern.Course;

public class HLD extends Course{

    @Override
    public void createCourse() {
        modulesList.add(new IntroModule());
        modulesList.add(new DemoModule());
        modulesList.add(new ExcersiceModule());
    }

}
