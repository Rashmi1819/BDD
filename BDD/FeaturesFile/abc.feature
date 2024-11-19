
Feature: Login to CRM project
Scenario: Login to CRM and createing campaign 
Given user should enter the url "192.168.61.128:8080"
When he should enter the username ""
And he should enter the password ""
And he should click on signin button
Then CRM home page should be displyed
And click on campaign module 
And click on new campaign button 
Then create campaign page should be displayed
When user enter the create campaign page
And Enter the details of Campaign Name: "Rashmi"
And enter the start date:
And Enter the End date:
And select the type
And Select the status 
When Click on save button
Then Campaign details page should be displayed


