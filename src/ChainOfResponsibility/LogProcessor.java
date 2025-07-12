package ChainOfResponsibility;

public abstract class LogProcessor {
    final int info = 1;
    final int debug = 2;
    final int error = 3;
    LogProcessor nexLogProcessor;

    LogProcessor(LogProcessor lp){
        this.nexLogProcessor = lp;
    }

    public void log(String mssg, int logLevel){
        if(nexLogProcessor != null){
            nexLogProcessor.log(mssg,logLevel);
        }
    }
}
