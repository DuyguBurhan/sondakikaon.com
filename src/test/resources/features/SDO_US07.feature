@run
Feature:SDO_US07 VISITORS SHOULD BE ABLE TO ACCESS NEWS DETAILS FROM THE BANNER

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 When clicking on the news image, the detail should be displayed on a new page
    Given :Scrolls the page
    Given :Clicks on the image of the banner
    Given :Verifies that it is directed to the detail of the Banner news
    Then  :Closes the page