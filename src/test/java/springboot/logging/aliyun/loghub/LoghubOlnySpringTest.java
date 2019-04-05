/*
 * Copyright 2018-2019 wongoo
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
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
