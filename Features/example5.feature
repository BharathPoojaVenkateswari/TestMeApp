Feature: Login with different set of test data

Scenario Outline: Login

Given user launching TestMeApp
When user enter username as "<username>" And password as "<password>"
Then Click Ok
And verify login result

Examples:
|username||password|
|lalitha||password123|
#|saranya||xyz|