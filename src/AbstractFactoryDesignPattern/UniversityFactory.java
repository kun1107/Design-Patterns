package AbstractFactoryDesignPattern;

/*
*Problem: need to create admit card of a college and calculate Fee based on course selected by student,
* university can be private or Government, it will be decided by marks obtend by student.
* */
public abstract class UniversityFactory {

    public final int score = 110;

    public static UniversityFactory selectUniversity(int score){
        if (score>110){
            return new GovernmentUniversity();
        }else{
            return new PrivateUniversity();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract FeeCalculator getFee(String course);


}

