package springboot.logging.aliyun.loghub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangoo
 * @crated 2018-02-27 09:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoghubOlnySpringTest.class)
@TestPropertySource(locations = "classpath:application-loghub-only.properties")
public class LoghubOlnySpringTest {

    @Test
    public void testLogback() {
        Logger logger = LoggerFactory.getLogger("test");
        logger.info("hello world");
        logger.info("param {}", "one");
    }
}
