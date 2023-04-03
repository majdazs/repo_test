package ma.geo.local;

import ma.geo.local.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PFEApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(PFEApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(PFEApplication.class);
        LOGGER.debug("Start application log1");
        LOGGER.warn("Start application log2");
        LOGGER.info("Start application log3");
        LOGGER.error("Start application log4");

    }

}
