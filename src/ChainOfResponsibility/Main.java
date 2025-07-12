package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObj.log("just for info",1);
        logObj.log("exception happen",3);
        logObj.log("need to debug this",2);
    }
}
