package Second;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
    private static Logger demoLogger = LogManager.getLogger(Demo2.class.getName());

    public static void main(String[] args) {
        demoLogger.info("Click succesfull");
        demoLogger.error("DB Connection failed");
        demoLogger.debug("Debug!");
        demoLogger.fatal("MEU DEUS");
        demoLogger.info("Click succesfull");
        demoLogger.error("DB Connection failed");
        demoLogger.debug("Debug!");
        demoLogger.fatal("MEU DEUS");demoLogger.info("Click succesfull");
        demoLogger.error("DB Connection failed");
        demoLogger.debug("Debug!");
        demoLogger.fatal("MEU DEUS");demoLogger.info("Click succesfull");
        demoLogger.error("DB Connection failed");
        demoLogger.debug("Debug!");
        demoLogger.fatal("MEU DEUS");
    }
}
