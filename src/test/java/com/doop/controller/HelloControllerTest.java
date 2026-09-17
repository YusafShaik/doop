package com.doop.controller;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    public void testHelloWorld() {
        Map<String, String> response = helloController.helloWorld();
        assertEquals("Hello World!", response.get("message"));
        assertEquals("success", response.get("status"));
    }

    @Test
    public void testHelloName() {
        Map<String, String> response = helloController.helloName("Alice");
        assertEquals("Hello Alice!", response.get("message"));
        assertEquals("success", response.get("status"));
    }

    @Test
    public void testAppInfo() {
        Map<String, Object> response = helloController.getAppInfo();
        assertEquals("Doop Application", response.get("appName"));
        assertEquals("1.0.0", response.get("version"));
        assertEquals("learning-deployment", response.get("environment"));
    }
}
