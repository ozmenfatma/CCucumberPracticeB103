package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //test çalıştırıcı notasyonu
@CucumberOptions(  // Seneryoların nerede ve nasıl çalışacağı,hangi raporu kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {
                "pretty",//raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,//raporlarin consolda okunakli sekilde cikmasi icin
        features = "src/test/resources/features", // features'ın yolunu belirmemiz gerekir
        glue = "stepdefinitions",// Kodlarımızı yazdığımız yeri belirtiriz
        tags = "@homework4", //Çalıştırmak istediğimiz seneryoya verdiğimiz tag'i belirtiriz
        dryRun = false // Seneryonun adımlarını kontrol eder ve çalıştığını görürüz
)



public class Runner {
}
