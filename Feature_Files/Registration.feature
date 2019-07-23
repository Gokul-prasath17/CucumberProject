Feature: Registration page
 This files describe registration for demoaut applications
 
 
 Scenario: Contact Information
Given open demoaut site and choose registration
And enter first name as "gokul" and last name "prasath" 
And give your phone number 9876543211
And enter your mail id "ureachgokul@gmail.com" 
When enter your Address 
And  enter your city "Chennai" 
And Select state as "Tamil Nadu"
When Select a postal code as 600015
And choose country through dropdown box as "INDIA" 
 When enter your user name "gprakash"
 And enter your password as "gokul123" and confirm password as "gokul123" 