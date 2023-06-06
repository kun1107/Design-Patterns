package AbstractFactoryDesignPattern;

public class PrivateUniversity extends UniversityFactory {
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "physics":
                return new SIRTAdmitCard();
            case "Maths":
                return new VITAdmitCard();
            case "CS":
                return new SRMAdmitCard();
            default:return null;
        }
    }

    @Override
    public FeeCalculator getFee(String course) {

        switch (course){
            case "physics":
                return new SIRTFee();
            case "Maths":
                return new VITFee();
            case "CS":
                return new SRMFee();
            default:return null;
        }
    }
}
