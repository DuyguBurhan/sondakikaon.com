
Feature:SDO_US06 VISITORS SHOULD BE ABLE TO SEE THE NEWS DETAİLS FROM THE BREAKING NEWS BAND

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 Switches between news with previous and next arrows
    Given :Scrolls the page
    Given :Clicks the next news button and confirms that the Numbers have changed
    Given :Clicks the previous news button and confirms that the Numbers have changed
    Then  :Closes the page

  @run
  Scenario:TC_02 Clicking on the slider numbers should display the news detail.
    Given :Scrolls the page
    Given :Clicks first number from Header Slider Numbers
    Given :Verifies that it is directed to the detail of the first news
    Then  :Closes the page