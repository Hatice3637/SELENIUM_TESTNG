package tests.log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JTest3 {

    private static Logger logger = LogManager.getLogger(Log4JTest3.class.getName());
    @Test
    public void log4jTest1(){
        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG ERROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");
    }
}
/*Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms
        deneme
        Privay*/