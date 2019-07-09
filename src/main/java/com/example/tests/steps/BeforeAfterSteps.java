package com.example.tests.steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAfterSteps {

    private static Logger LOGGER = LoggerFactory.getLogger(BeforeAfterSteps.class);

    @BeforeStories
    public void setUpBefore() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.reportsFolder = "target/jbehave/view/tests";
        Configuration.screenshots = false;
        Configuration.baseUrl = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
        LOGGER.info("< Before Stories >");
    }

    @BeforeStory
    public void setUpBeforeStory() {
        Selenide.open("");
        LOGGER.info("< Before Story >");
    }

    @BeforeScenario
    public void setUpBeforeScenario() {
        LOGGER.info("< Before Scenario >");
    }

    @AfterScenario
    public void tearDownAfterScenario() {
        LOGGER.info("< After Scenario >");
    }

    @AfterStory
    public void tearDownAfterStory() {
        LOGGER.info("< After Story >");
    }

    @AfterStories
    public void tearDownAfterStories() {
        LOGGER.info("< After Stories >");
    }
}
