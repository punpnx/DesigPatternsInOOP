public interface LogHandler {
    public void setNext(LogHandler handler);
    public void handleRequest(LogRequest request);
}