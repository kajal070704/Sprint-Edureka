Feature: Search in HomePage


Scenario: Download Curriculum
Given I am on edureka homepage
When I scrolling down
When I click on BECOME A DEVOPS ENGINEER
When  I scroll down
And  I click DOWNLOAD CURRICULUM
And I enter email as "chintalatanusha@gmail.com"
And I enter phno as "9391548398"
And I click Start Download
And I click skip
Then Download Completed


Scenario: Download Unsuccessful
Given I am on edureka homepage
When I scrolling down
When I click on BECOME A DEVOPS ENGINEER
When  I scroll down
And  I click DOWNLOAD CURRICULUM
And I enter email as "chintalatanusha@gmail.com"
And I enter phno as "93915483"
And I click Start Download
Then Download is not completed
@SanityTest
Scenario: play course preview
Given I am on edureka homepage
When I am scrollDown1
And I click BECOME A DATA SCIENTIST
And I click the play button
And I enter the email as "chintalatanusha@gmail.com"
And I Enter the phone number as "9391548398"
And I click on unlock video
Then I am able to play the video
@SanityTest
Scenario: Enrolling a Course
Given I am on edureka homepage
When I scroll down to trending couse
And I click SELENIUM CERTIFICATION TRAINING COURSE
And I click Enroll
And I enter in enrolling email as "chintalatanusha@gmail.com"
And I enter in enrolling phno as "9391548398"
And I click Enroll Now
Then Enrolling Sucessful
@SanityTest
Scenario: Reading Reviews
Given I am on edureka homepage
When I scroll down to reviews
And I click VIEW ALL REVIEWS
Then I click Read More
Then reading sucessful