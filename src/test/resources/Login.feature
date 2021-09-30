Feature: Login function testing
Description: password must be 6 characters
#Background: common steps

Scenario: As a Zoopla user, I can login using valid credentials

Given open browser and send URL
When login with valid credentials
#|sarowerny@gmail.com|student|
Then Check login was succesful