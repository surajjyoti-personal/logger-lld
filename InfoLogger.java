public class InfoLogger extends Logger{
    public InfoLogger(Logger nextLogger){
        super(nextLogger);
    }
    public void log(LogLevel level, String message){
        if (level == LogLevel.INFO){
            LogMessage msg = new LogMessage(level, message);
            for (LogAppender appender : this.getAppenders())
                appender.append(msg);
        }
        else super.log(level, message);
    }
}
