import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by Hoang Anh on 25-Feb-16.
 */
public class HelloWorld {

    private static final Logger log = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) throws IOException {
        LoggerExample.log();
    }
}
