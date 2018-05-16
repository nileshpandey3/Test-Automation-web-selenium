package com.company;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.jvm.hotspot.utilities.Assert;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Main {


    @Test
    public void signInTest() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.marcus.com/us/en");
        driver.findElementByCssSelector(".Navigation__login").click();
        String expectedUrl = "https://www.marcus.com/us/en/login";
        driver.get(expectedUrl);
        assertEquals(expectedUrl,driver.getCurrentUrl());



    }
}
