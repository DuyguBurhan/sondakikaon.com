@run
Feature:SDO_US02 VISITORS SHOULD BE ABLE TO CLİCK ON HOMEPAGE SECTİONS AND ICONS

  Background:User goes to homepage
    Given   :User goes to "url" homepage
    Given   :Accepts Cookie
    Given   :Responds to notification sending request


  Scenario:TC_01 Logo should be clickable
    Given :Clicks on the latest news logo
    Given :Confirms redirection to the homepage
    Then  :Closes the page


  Scenario:TC_02 Social Media icons should be clickable, direct to the relevant social network
    Given :Scrolls to end of page
    Given :Clicks on Facebook icon
    Given :Verifies redirection to Facebook Page
    Given :Clicks on Instagram icon
    Given :Verifies redirection to Instagram Page
    Given :Clicks on Twitter icon
    Given :Verifies redirection to Twitter Page
    Then  :Closes the page


  Scenario:TC_03 Youtube and RSS icons should be clickable
    Given :Scrolls to footer
    Given :Clicks on Youtube icon
    Given :Verifies redirection to Youtube Page
    Given :Clicks on RSS icon
    Given :Verifies redirection to RSS Page
    Then  :Closes the page


  Scenario:TC_04 Cookie Notice should redirect to the relevant page
    Given :Scrolls to end of page
    Given :Clicks on Cookie Policy
    Given :Verifies that you have been redirected to the Cookie Policy page
    Then  :Closes the page


  Scenario:TC_05 Brand band details should be accessible
    Given :Scrolls to end of page
    Given :Clicks on Media Internet in the Brand Band
    Given :Verifies being redirected to the Media Internet page
    Then  :Closes the page