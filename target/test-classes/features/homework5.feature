#http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#Scenario : TC_17_kullanici_sirket_Prev_Close_alabilmeli olusturun ve asagidaki testi
#Given user web sayfasinda
#And “Istenen Sirket” Prev.Close degerini yazdirir

@homework5
Feature:Guru_Web_Tables
  Scenario: TC_01_kullanici_liste_alabilmeli
    Given Kullanıcı web sayfasına "http://demo.guru99.com/test/web-table-element.php" gider
    Then Company listesini consola yazdırır
    And   "IDFC Bank" Prev.Close degerini yazdirir
    And kullanici sayfayi kapatir