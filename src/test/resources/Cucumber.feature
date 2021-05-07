Feature: Functional testing in Mystore app
  @Testing

  #Testing Mystore functionalities
  Scenario: User verification for filter options in different catalogs
    #Login verification
    Given user is on the mystore page
    And user click on Signin link
    And user enter the emailandPWD
    When user click on signin button
    Then MyStore home page displayed
    #Cloths-Men size filter
    And user navigate to cloths men page
    When user select the size M
    Then user verified size M is enabled
    #Art Dimension filter
    And user is on the art page
    When user select dimensions sixtyninty
    Then the user virified selected dimension is enabled
    #Clothes-Women sortby filter
    And user is on clothes women page
    When user select sortby index 1
    Then Name A to Z selected in sortby dropdown
    #Search - check the multiple items present with the same string in the name
    And user enter mug in search bar
    Then verifes the current url
    Then user close the window