package com.example.tests.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.jbehave.core.annotations.*;

import static com.codeborne.selenide.Selenide.$;

public class MySteps {

    @Given("I am a pending step")
    public void given() {
        System.out.println("I am a pending step");
    }

    @When("a good soul will implement me")
    public void when(){
        System.out.println("a good soul will implement me");
    }

    @Then("I shall be happy")
    public void then() {
        System.out.println("I shall be happy");
    }

    @Then("Login user $user using password $password")
    public void login(@Named("user") String user, @Named("password") String pass) {
        $("#loginform").waitUntil(Condition.visible, 9000);
        $("#user_login").shouldBe(Condition.visible, Condition.enabled).setValue(user);
        $("#user_pass").shouldBe(Condition.visible, Condition.enabled).setValue(pass);
        $("#wp-submit").shouldBe(Condition.enabled).click();
        $("#wp-admin-bar-wp-logo").shouldBe(Condition.visible);
        Selenide.sleep(3000);
    }

}
