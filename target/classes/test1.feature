Feature: Test1
  As a user I will test site BBC
  I want to test functionality according my tasks

  1. Add a test that:
  Goes to BBC
  Clicks on News
  Checks the name of the headline article
  (the one with the biggest picture and text)
  against a value specified in your test (hard-coded)

  2.Add another test:
  Goes to BBC
  Clicks on News
  Checks secondary article titles
  (the ones to the right and below the headline article)
  against a List specified in your test (hard-coded).
  Imagine that you are testing the BBC site on a test environment,
  and you know what the titles will be.
  Your test, then, checks that these titles are in fact present on the page.
  The test should pass if all the titles are found, and fail if they are not found.
  It's normal that your test will fail the next day - this would not happen if we had a
  Test environment for BBC, with a static database.

  3.Write a test that:
  Goes to BBC
  Clicks on News
  Stores the text of the Category link of the headline article (e.g. World, Europe...)
  Enter this text in the Search bar
  Check the name of the first article against a specified value (hard-coded)

  Scenario Outline: Test1
    Given User opens '<homePage>' page
    And user click button consent
    And user click button news
    And user check the name of the '<headline>' article


    Examples:
      | homePage            | headline                                          |
      | https://www.bbc.com | Australia to end strict Covid border restrictions |

  Scenario Outline: Test2
    Given User opens '<homePage>' page
    And user click button consent
    And user click button news
    And user checks firstBottomNews '<firstBottomNews>' article titles
    And user checks secondBottomNews '<secondBottomNews>' article titles
    And user checks thirdBottomNews '<thirdBottomNews>' article titles
    And user checks fourthBottomNews '<fourthBottomNews>' article titles
    And user checks fifthBottomNews '<fifthBottomNews>' article titles



    Examples:
      | homePage            | firstBottomNews                             | secondBottomNews                                   | thirdBottomNews                                     | fourthBottomNews                                 | fifthBottomNews                              |
      | https://www.bbc.com | Sarah Everards murderer will never be freed | Nazi camp secretary caught after fleeing her trial | Youth have right to be angry on climate, UK PM says | Sarkozy gets jail sentence over campaign funding | Pop superstar Shakira attacked by wild boars |


  Scenario Outline: Test3
    Given User opens '<homePage>' page
    And user click button consent
    And user click button news
    And user click on headline news
    And user get name article of headline news
    And user click on button search bar
    And user click on search bar
    And user put name headline article
    And user click on search button
    And user check names articles
    Examples:
      | homePage            |
      | https://www.bbc.com |