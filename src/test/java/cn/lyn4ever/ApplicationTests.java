package cn.lyn4ever;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(locations="classpath*:/application.yml")
public class ApplicationTests {

    private final static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

    @Test
    public void contextLoads() {
//        TRACE < DEBUG < INFO < WARN < ERROR
        logger.trace("TRACE 成功了");
        logger.debug("DEBUG 成功了");
        logger.info("INFO 成功了");
        logger.warn("WARN 成功了");
        logger.error("ERROR 成功了");

    }

}
