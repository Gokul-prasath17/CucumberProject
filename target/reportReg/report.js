$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature_Files/Registration.feature");
formatter.feature({
  "name": "Registration page",
  "description": " This files describe registration for demoaut applications",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Contact Information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open demoaut site and choose registration",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterCheck.open_demoaut_site_and_choose_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter first name as \"gokul\" and last name \"prasath\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.enter_first_name_as_and_last_name(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "give your phone number 9876543211",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.give_your_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your mail id \"ureachgokul@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.enter_your_mail_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your Address",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterCheck.enter_your_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your city \"Chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.enter_your_city(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select state as \"Tamil Nadu\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.select_state_as_and_postal_code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select a postal code as 600015",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterCheck.postalcode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose country through dropdown box as \"INDIA\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.choose_country_through_dropdown_box_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your user name \"gprakash\"",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterCheck.enter_your_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your password as \"gokul123\" and confirm password as \"gokul123\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterCheck.enter_your_password_as_and_confirm_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
});