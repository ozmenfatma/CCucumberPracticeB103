package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.S_Homework4;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GuruStepDefinitions {

    S_Homework4 s_homework4 = new S_Homework4();

    @Given("Kullanıcı web sayfasına {string} gider")
    public void kullanıcı_web_sayfasına_gider(String string) {
        Driver.getDriver().get(string);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Driver.getDriver().switchTo().frame(s_homework4.iframe);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        s_homework4.cookie.click();
        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("Company listesini consola yazdırır")
    public void company_listesini_consola_yazdırır() {

        List<WebElement> company = s_homework4.company;
        for (WebElement row : company) {
            System.out.println(row.getText());


        }
    }


    @And("kullanici DCBBankin {string} listede olduğunu test eder")
    public void kullaniciDCBBankinListedeOlduğunuTestEder(String string) {

      //  Assert.assertFalse(s_homework4.company.contains(string));
      s_homework4=new S_Homework4();
//        demoGuruPage.company.stream().forEach(t-> t.getText().contains(toString()));
//        List<String>textList = new ArrayList<>();
//        for(WebElement w: s_homework4.company){
//           textList.add(w.getText());
//        }
      //  Assert.assertTrue(textList.contains(string));
        List<String> text =s_homework4.company.stream().map(t->t.getText()).collect(Collectors.toList());
        Assert.assertTrue(text.contains(string));
    }

}

