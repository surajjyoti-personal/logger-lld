import java.time.LocalDateTime;

public class LogMessage {
    private final LogLevel level;
    private final String message;
    private final LocalDateTime timeStamp;
    public LogMessage(LogLevel level, String message) {
        this.level = level;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }
    public String toString() {
        return  "[" + level + "]" + " " + timeStamp.toString() + "-" + message;
    }
}
