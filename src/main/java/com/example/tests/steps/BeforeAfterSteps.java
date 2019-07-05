package com.example.tests.steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;

public class BeforeAfterSteps {

    @BeforeStories
    public void setUpBefore() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
        System.out.println("BeforeStories");
    }

    @BeforeStory
    public void setUpBeforeStory() {
        Selenide.open("");
        System.out.println("BeforeStory");

    }
}
