@homework
Feature:homework_Blue_Rental

  Scenario Outline: :TC01_US167854_manager_login_test
    Given kullanici "https://www.bluerentalcars.com/" gider
    When kullanici loginGiris butonuna tiklar
    Then kullanici e-mail "<email>" girer
    Then kullanici password "<password>" girer
    Then kullanici loginButton butonuna tiklar
    And  kullanici sayfaya girdigini dogrular
    And  close the application









    Examples:Blue_rental_Giris_Bilgileri
      |  email                                |password   |
      |  sam.walker@bluerentalcars.com        |c!fas_art  |
      |  kate.brown@bluerentalcars.com        |tad1$Fas   |
      |  raj.khan@bluerentalcars.com          |v7Hg_va^   |
      |  pam.raymond@bluerentalcars.com       |Nga^g6!    |