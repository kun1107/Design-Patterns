package AbstractFactoryDesignPattern;

public class Student {

    public static void main(String[] args) {
        int score = 120;
        UniversityFactory selectedUniversity = UniversityFactory.selectUniversity(score);

       AdmitCard admitCard =  selectedUniversity.getAdmitCard("physics");
        System.out.println(admitCard.getAdmitCard());
        FeeCalculator fees = selectedUniversity.getFee("physics");
        System.out.println(fees.calculateFee());

        score = 90;
        UniversityFactory selectedUniversity1 = UniversityFactory.selectUniversity(score);

        AdmitCard admitCard1 =  selectedUniversity1.getAdmitCard("physics");
        System.out.println(admitCard1.getAdmitCard());
        FeeCalculator fees1 = selectedUniversity1.getFee("physics");
        System.out.println(fees1.calculateFee());


    }



}
