public class InfoLogHandler implements LogHandler {
    private LogHandler next;

    @Override
    public void setNext(LogHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(LogRequest request) {
        if (request.getLevel().equals("INFO")) {
            System.out.println("Standard Console::Logger: " + request.getMessage());
        } else {
            next.handleRequest(request);
        }
    }
}
