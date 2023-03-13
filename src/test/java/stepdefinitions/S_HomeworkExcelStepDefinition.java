package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ExcelUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class S_HomeworkExcelStepDefinition {

    ExcelUtils excelUtils;
    List<Map<String,String>> exceldatalari;
    String path="src/test/resources/testdata/Capitals.xlsx";
    String sayfa="Sheet1";

    @Given("{int} inci satirdaki {int} inci hucreye gidelim ve yazdiralim")
    public void inci_satirdaki_inci_hucreye_gidelim_ve_yazdiralim(Integer int1, Integer int2) throws IOException {

        excelUtils=new ExcelUtils(path,sayfa);
        excelUtils.getCellData(1,2);

    }
    @Then("baskenti {string} olan ulke ismini yazdiralim")
    public void baskenti_olan_ulke_ismini_yazdiralim(String string) {
   List<Map<String,String>> bilgiler= excelUtils.getDataList();

   for(Map<String,String> w : bilgiler){
       w.values();
       if (w.containsValue(string)){
           System.out.println(w);
       }

   }


    }
    @Then("kullanici ulke sayisini yazdirir")
    public void kullanici_ulke_sayisini_yazdirir() {
        System.out.println("( ulke sayisi = " + (excelUtils.rowCount() - 1));
    }
    @Then("kullanici fiziki olarak kullanilan satir sayisini bulur")
    public void kullanici_fiziki_olarak_kullanilan_satir_sayisini_bulur() {

    }
    @Then("kullanici baskenti {string} olan ulkenin tum bilgilerini yazdirir")
    public void kullanici_baskenti_olan_ulkenin_tum_bilgilerini_yazdirir(String string) {

    }
    @Then("kullanici kullanilan toplam satir ve sutun sayisini yazdirir")
    public void kullanici_kullanilan_toplam_satir_ve_sutun_sayisini_yazdirir() {

    }
}
