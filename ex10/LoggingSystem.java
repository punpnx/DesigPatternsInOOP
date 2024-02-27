// Chain of Responsibility design pattern
public class LoggingSystem {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoLogHandler();
        LogHandler debugHandler = new DebugLogHandler();
        LogHandler errorHandler = new ErrorLogHandler();

        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        LogRequest infoRequest = new LogRequest("This is an information.", "INFO");
        infoHandler.handleRequest(infoRequest);
        System.out.println("----------------------------------");

        LogRequest debugRequest = new LogRequest("This is a debug information.", "DEBUG");
        infoHandler.handleRequest(debugRequest);
        System.out.println("----------------------------------");
        
        LogRequest errorRequest = new LogRequest("This is an error information.", "ERROR");
        infoHandler.handleRequest(errorRequest);
    }
}
