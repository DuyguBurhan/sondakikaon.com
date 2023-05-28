Feature:SDO_US01 ZIYERETCI ANASAYFADAKI BOLUM BASLIKLARINI GOREBILMELI

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 Logo Gorunur Olmali
    Given :sondakikaon logosunun gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_02 Finansal Veriler Gorunur Olmali
    Given :Finansal Veriler bandinda Bist, Dolar, Euro ve Altın verilerinin gorundugunu dogrular
    Then  :Closes the page

  Scenario:TC_03 Menu gorunur olmali
    Given :Menu butonunun gorunur oldugunu dogrular
    Given :Menu butonu yanindaki menu basliklarinin gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_04 Arama Butonu Gorunur Olmali
    Given :Arama butonunun gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_05 sondakika Bandi gorunur olmali
    Given :sondakika Bandinin gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_06 Manset slider gorunur olmali
    Given :Scrolls the page
    Given :Manset Slider'inin gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_07 Banner gorunur olmali
    Given :Scrolls the page
    Given :Banner'in gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_08 Ekonomi, Saglik, Yerel Haberler basliklari gorunur olmali
    Given :Scrolls the page
    Given :Ekonomi bolum basliginin gorunur oldugunu dogrular
    Given :Saglik bolum basliginin gorunur oldugunu dogrular
    Given :Yerel Haberler bolum basliginin gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_09 Sosyal Medya ikonlari gorunur olmali
    Given :Sayfa sonuna scroll yapar
    Given :Sosyal Medya ikonlarinin gorunur oldugunu dogrular
    Then  :Closes the page


  Scenario:TC_10 Footer'da Çerez bildirimi ve marka bandi gorunur olmali
    Given :Sayfa sonuna scroll yapar
    Given :Footer'in gorunur oldugunu dogrular
    Given :Marka Bandi'nin gorunur oldugunu dogrular
    Then  :Closes the page
