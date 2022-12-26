public class Main {

    private static LogProcessor getChainOfLogs(){
        return new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    }
    public static void main(String[] args) {
        LogProcessor logger = getChainOfLogs();
        logger.log(LogProcessor.INFO, "This is the message.");
        logger.log(LogProcessor.DEBUG, "This is the message.");
        logger.log(LogProcessor.ERROR, "This is the message.");
    }
}