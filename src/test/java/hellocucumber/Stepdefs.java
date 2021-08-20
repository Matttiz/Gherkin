package hellocucumber;

import helpers.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.WeekDay;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;


public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("Today")
    public void actualDay() {
        WeekDay day = new WeekDay();
        today = day.getDay();
    }

    @Given("Today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void isItFriday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void shouldToldMe(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}