package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor lp) {
        super(lp);
    }

    @Override
    public void log(String mssg, int logLevel) {
        if(logLevel == error){
            System.out.println("error: "+ mssg);
        }else{
            super.log(mssg, logLevel);
        }

    }
}
