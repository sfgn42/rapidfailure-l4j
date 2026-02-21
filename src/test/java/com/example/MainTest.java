package com.example;

import dev.langchain4j.data.message.UserMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    private static final Logger logger = LogManager.getLogger(MainTest.class);

    @Test
    void testLangchain4jClassesAvailable() {
        UserMessage message = UserMessage.from("Hello");
        assertNotNull(message);
        logger.info("LangChain4j UserMessage created successfully: {}", message);
    }

    @Test
    void testLog4jLoggerAvailable() {
        assertNotNull(logger);
        logger.info("Log4j2 logger is available");
    }
}
