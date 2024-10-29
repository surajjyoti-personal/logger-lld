import java.util.List;

public abstract class Logger {
    private Logger nextLogger;
    private List<LogAppender> appenders;
    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public List<LogAppender> getAppenders() {
        return appenders;
    }

    public void setAppenders(List<LogAppender> appenders) {
        this.appenders = appenders;
        if (nextLogger != null)
            this.nextLogger.setAppenders(appenders);
    }

    public void addAppender(LogAppender appender) {
        this.appenders.add(appender);
    }

    public void log(LogLevel level, String message) {
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }
}
