package com.example;

import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting rapidfailure-l4j application");
        logger.info("LangChain4j and Log4j2 are configured and ready to use");
        logger.debug("UserMessage class available: {}", UserMessage.class.getName());
        logger.debug("ChatLanguageModel interface available: {}", ChatLanguageModel.class.getName());
    }
}
