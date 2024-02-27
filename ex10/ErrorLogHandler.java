public class ErrorLogHandler implements LogHandler {
    private LogHandler next;

    @Override
    public void setNext(LogHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(LogRequest request) {
        if (request.getLevel().equals("ERROR")) {
            System.out.println("Error Console::Logger: " + request.getMessage());
            System.out.println("File::Logger: " + request.getMessage());
            System.out.println("Standard Console::Logger: " + request.getMessage());
        } else {
            next.handleRequest(request);
        }
    }
}
