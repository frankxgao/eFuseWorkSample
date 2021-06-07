## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)


## General info 
Selenium WebDriver Test Script for eFuse
### Goal: Implement automated UI webdriver tests for the following use cases:
Login
 - Login Failure
 - Login Sucess

Searching for a User
 - Navigate to portfolio (For testing, please use user “mjb”)
 - Navigate to user's profile
 - Navigate to Users Posts
 - Navigate to Users Media

Navigate to following
 - Navigate to Discover Page
   - Open an organization
 - Navigate to Opportunities
   - Click on opportunities


## Technologies
Project is created with:
* Java version: 1.8
* Selenium Webdriver version: 3.141
* Eclipse IDE


## Setup
### To install the technologies needed
1. Download and install the Java Software Development Kit [(JDK) Here.](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Download and install the latest version of ["Eclipse IDE for Java Developers" here.](http://www.eclipse.org/downloads/)
3. Download the [Selenium Webdriver for Java Client Driver here.](https://www.selenium.dev/downloads/)
4. Download correct version of [Chromedriver here.](https://chromedriver.chromium.org/downloads)
5. For more detailed instructions on installing Selenium webdriver [Click here.](https://www.guru99.com/installing-selenium-webdriver.html)

### To run the test script
1. Open Git Bash, to install [Git Bash Click Here.](https://git-scm.com/downloads)
2. Clone the github repository
```
$ git clone https://github.com/frankxgao/eFuseWorkSample.git
```
Launch Eclipse IDE
 1. Click on Add a local project
 2. Navigate to the eFuseWorkSample folder in Project path
 3. Click Finished
 4. Change the Chromedriver executable path in `System.setProperty("webdriver.chrome.driver", "C://Your Chromedriver.exe dir")`
 5. Change `eFuseEmail` to a working eFuse login
 6. Change `eFusePassword` with the password
 7. Run the test script
 
[![Watch the video](https://imgur.com/2qhHqUC.png)](https://imgur.com/2qhHqUC.png)
[![Watch the video](https://i.imgur.com/M54Ze7h.png)](https://youtu.be/dWOaTaMvqtU)


