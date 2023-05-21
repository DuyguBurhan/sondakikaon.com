Feature:ZIYERETCI ANASAYFADAKI BOLUM BASLIKLARINI GOREBILMELI

  Background:Kullanici Anasayfaya gider
    Given   :Kullanici "url" anasayfaya gider


  Scenario:TC_01 Logo Gorunur Olmali
    Given :sondakikaon logosunun gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_02 Finansal Veriler Gorunur Olmali
    Given :Finansal Veriler bandinda Bist, Dolar, Euro ve Altın verilerinin gorundugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_03 Menu gorunur olmali
    Given :Menu butonunun gorunur oldugunu dogrular
    Given :Menu butonu yanindaki menu basliklarinin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_04 Arama Butonu Gorunur Olmali
    Given :Arama butonunun gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_05 sondakika Bandi gorunur olmali
    Given :sondakika Bandinin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir

  @run
  Scenario:TC_05 Manset slider gorunur olmali
    Given :Sayfayi kaydirir
    Given :Manset Slider'inin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir

