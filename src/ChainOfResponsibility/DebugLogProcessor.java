package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor lp) {
        super(lp);
    }

    @Override
    public void log(String mssg, int logLevel) {
        if(logLevel == debug){
            System.out.println("Debug:" +mssg);
        }else{
            super.log(mssg, logLevel);
        }

    }
}
