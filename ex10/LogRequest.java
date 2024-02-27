public class LogRequest {
    private String message;
    private String level;

    public LogRequest(String message, String level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }
}
