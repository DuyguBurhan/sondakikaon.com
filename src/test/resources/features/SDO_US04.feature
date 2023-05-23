Feature:SDO_US04 VISITORS SHOULD BE ABLE TO SEARCH NEWS AND ARCHIVES NEWS

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


#  Scenario:TC_01 There should be a news search feature from the archive by entering the date
#    Given :Clicks the Search Button
#    Given :Writes the day, month, year in the "Tarihe Gore Arama" section
#    Given :Clicks the "Arşiv Getir" button
#    Given :Verifies redirected to the news archive with entered date
#    Then  :Closes the page


#  Scenario:TC_02 News details should be accessed on the site by searching for words.
#    Given :Clicks the Search Button
#    Given :Writes "trafik kazası" in Kelimeye Gore Arama text box
#    Given :Clicks on Haberlerde Ara button
#    Given :Verifies redirection to the news archive with entered words
#    Then  :Closes the page