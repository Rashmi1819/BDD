
Feature: Login to DemoOrangeHRM 
Scenarios Outline: Multiple Login
Given We should enter "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" in the browser
When He enter the username as "<username>"
And He enter the password as "<password>"
And He clicks on Login button
Then DemoOrangeHRM home page should be displayed

Examples:
|username|password|
|admin|admin123|
|rashmi|sk|
