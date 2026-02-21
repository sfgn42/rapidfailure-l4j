package com.rapidfailure.l4j;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

    @Test
    void appCanBeInstantiated() {
        App app = new App();
        assertNotNull(app);
    }

    @Test
    void mainRunsWithoutException() {
        App.main(new String[]{});
    }
}
