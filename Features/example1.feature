Feature: Login Test

Scenario:Login with valid credentails
Given user launch chrome browser And enters TestMeApp URl
When  user enter username in username field
When user enter password in password field
When user clicks the login button
Then it verifies successful login