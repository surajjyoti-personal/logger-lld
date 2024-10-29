public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }
    public void log(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            LogMessage msg = new LogMessage(level, message);
            for (LogAppender appender : this.getAppenders())
                appender.append(msg);
        }

        else super.log(level, message);
    }
}
