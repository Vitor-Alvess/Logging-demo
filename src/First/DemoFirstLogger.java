package First;
import org.apache.logging.log4j.*;

public class DemoFirstLogger {
    private static Logger demoLogger = LogManager.getLogger(DemoFirstLogger.class);

    public static void main(String[] args) {
        demoLogger.info("Click succesfull");
        demoLogger.error("DB Connection failed");
        demoLogger.debug("Debug!");
    }
}
