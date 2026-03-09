# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

**Build and run:**
```bash
# From the gs/ directory
tools/run.sh
# Which expands to:
mvn -DskipTests package exec:java -Dexec.mainClass=com.example.Main -Dexec.classpathScope=runtime
```

**Run tests:**
```bash
mvn test
```

**Run a single test:**
```bash
mvn test -Dtest=MainTest#testLangchain4jClassesAvailable
```

**Build only:**
```bash
mvn package
```

## Architecture

This is a Maven Java 17 project (`com.rapidfailure:rapidfailure-l4j`) that demonstrates LangChain4j integration with Log4j2 logging.

**Key dependencies:**
- `langchain4j` + `langchain4j-open-ai` (v1.11.0) — LLM chat model integration via OpenAI-compatible API
- `log4j-api` + `log4j-core` + `log4j-slf4j-impl` (v2.24.3) — logging with SLF4J bridge to capture LangChain4j's internal logs
- JUnit Jupiter 5 for testing

**Flow in `Main.java`:** builds an `OpenAiChatModel`, sends a multi-turn conversation (two user messages with the AI response threaded in between), and logs results via Log4j2.

**Logging config** (`src/main/resources/log4j2.xml`): console appender at DEBUG level with timestamp/thread/level/logger/message pattern.

**The demo OpenAI endpoint** (`http://langchain4j.dev/demo/openai/v1`) is a public test proxy — not a production API.
