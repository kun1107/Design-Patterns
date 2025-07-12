package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor lp) {
        super(lp);
    }

    @Override
    public void log(String mssg, int logLevel) {
        if(logLevel == info){
            System.out.println(mssg);
        }else{
            super.log(mssg,logLevel);
        }
    }
}
