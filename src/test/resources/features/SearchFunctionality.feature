Feature: To validate the FlipKart applications


  
Background:
 
 Given Launch the Flipkart application
 When close the popup
 Then it should navigate to home page
    
Scenario: To validate the search Function

Given User enter the text in nthe search felid
When Click the search button
Then It should navigate to the search result page display the details