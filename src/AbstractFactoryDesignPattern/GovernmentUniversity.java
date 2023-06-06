package AbstractFactoryDesignPattern;

public class GovernmentUniversity extends UniversityFactory {


    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "physics":
                return new CaltechAdmitCard();
            case "Maths":
                return new MITAdmitCard();
            case "CS":
                return new GeorgiaAdmitCard();
            default:return null;
        }
    }

    @Override
    public FeeCalculator getFee(String course) {

        switch (course){
            case "physics":
                return new CaltechFee();
            case "Maths":
                return new MITFee();
            case "CS":
                return new GeorgiaFee();
            default:return null;
        }
    }
}
