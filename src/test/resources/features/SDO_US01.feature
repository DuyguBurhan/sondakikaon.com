@run
Feature:ZIYERETCI ANASAYFADAKI BOLUM BASLIKLARINI GOREBILMELI

  Background:Kullanici Anasayfaya gider
    Given :Kullanici "url" anasayfaya gider
    Given :Cerez bildirimini kabul eder
    Given :Bildirim Gonderme Talebini Yanitlar


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


  Scenario:TC_06 Manset slider gorunur olmali
    Given :Sayfayi kaydirir
    Given :Manset Slider'inin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_07 Banner gorunur olmali
    Given :Sayfayi kaydirir
    Given :Banner'in gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_08 Ekonomi, Saglik, Yerel Haberler basliklari gorunur olmali
    Given :Sayfayi kaydirir
    Given :Ekonomi bolum basliginin gorunur oldugunu dogrular
    Given :Saglik bolum basliginin gorunur oldugunu dogrular
    Given :Yerel Haberler bolum basliginin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_09 Sosyal Medya ikonlari gorunur olmali
    Given :Sayfa sonuna scroll yapar
    Given :Sosyal Medya ikonlarinin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir


  Scenario:TC_10 Footer'da Çerez bildirimi ve marka bandi gorunur olmali
    Given :Sayfa sonuna scroll yapar
    Given :Footer'in gorunur oldugunu dogrular
    Given :Marka Bandi'nin gorunur oldugunu dogrular
    Then  :Sayfayi kapatir

