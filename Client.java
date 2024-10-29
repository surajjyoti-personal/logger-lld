import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new ErrorLogger(null));
        List<LogAppender> appenders = new ArrayList<LogAppender>();
        appenders.add(new ConsoleAppender());
        appenders.add(new FileAppender("./app.log"));
        logger.setAppenders(appenders);
        logger.log(LogLevel.ERROR, "This is an info log");
    }
}
