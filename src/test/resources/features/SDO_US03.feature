Feature:SDO_US03 VISITORS SHOULD BE ABLE TO CLİCK ON THE MEGA MENU BUTTON AND ACCESS SUBCATEGORIES

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 Sub-headings and details of Balikesir Haber should be accessible
    Given :Clicks on Mega Menu Button
    Given :Verifies that the Balikesir Guncel  header appears
    Given :Verifies that the Asayis header appears
    Given :Verifies that the Ekonomi header appears
    Given :Verifies that the Spor header appears
    Given :Verifies that the Saglik header appears
    Given :Verifies that the Egitim header appears
    Given :Clicks on Balikesir Guncel Headline
    Given :Verifies that the details of Balikesir Guncel News have been reached
    Then  :Closes the page


  Scenario:TC_02 Sub-headings and details of Ilce Haberleri should be accessible
    Given :Clicks on Mega Menu Button
    Given :Verifies that the Ayvalik Haberleri header appears
    Given :Verifies that the Edremit Haberleri header appears
    Given :Verifies that the Bandirma Haberleri header appears
    Given :Verifies that the Burhaniye Haberleri header appears
    Given :Verifies that the Susurluk Haberleri header appears
    Given :Verifies that the Erdek Haberleri header appears
    Given :Clicks on Erdek Haberleri Headline
    Given :Verifies that the details of Erdek Haberleri News have been reached
    Then  :Closes the page


  Scenario:TC_03 Sub-headings and details of Bolge Haberleri should be accessible
    Given :Clicks on Mega Menu Button
    Given :Verifies that the Bursa Haber header appears
    Given :Verifies that the Izmir Haber header appears
    Given :Verifies that the Canakkale Haber header appears
    Given :Verifies that the Manisa Haber header appears
    Given :Verifies that the Kutahya Haber header appears
    Given :Verifies that the Aydin Haber header appears
    Given :Clicks on Canakkale Haber Headline
    Given :Verifies that the details of Aydin Haber News have been reached
    Then  :Closes the page