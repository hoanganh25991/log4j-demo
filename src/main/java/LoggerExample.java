import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {

    private static final Logger LOG = LogManager.getLogger(LoggerExample.class);

    public static void log(String... args){
        LOG.debug("This will be printed on debug");
        LOG.info("This will be printed on info");
        LOG.warn("This will be printed on warn");
        LOG.error("This will be printed on error");
        LOG.fatal("This will be printed on fatal");
    }
}
