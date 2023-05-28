Feature:SDO_US05 VISITORS SHOULD BE ABLE TO SEE THE NEWS DETAİLS FROM THE BREAKING NEWS BAND

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 When clicking on the news title, the detail should be displayed on a new page
    Given :Scrolls the page
    Given :Clicks on first news on the Headline Slider
    Given :Verifies that it is redirected to the news detail
    Then  :Closes the page