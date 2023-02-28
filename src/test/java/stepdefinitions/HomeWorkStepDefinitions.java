package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeworkPage;
import utilities.Driver;

public class HomeWorkStepDefinitions {
    HomeworkPage homeworkpage=new HomeworkPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici loginGiris butonuna tiklar")
    public void kullanici_login_giris_butonuna_tiklar() {
        homeworkpage.loginGiris.click();


    }
    @Then("kullanici e-mail {string} girer")
    public void kullanici_e_mail_girer(String string) {
        homeworkpage.email.sendKeys(string);

    }
    @Then("kullanici password {string} girer")
    public void kullanici_password_girer(String string) {
        homeworkpage.password.sendKeys(string);

    }
    @Then("kullanici loginButton butonuna tiklar")
    public void kullanici_login_button_butonuna_tiklar() {
        homeworkpage.loginButton.click();

    }
    @Then("kullanici sayfaya girdigini dogrular")
    public void kullanici_sayfaya_girdigini_dogrular() {
        Assert.assertTrue(homeworkpage.dogrulamaMetni.isDisplayed());

    }

    @And("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
}
