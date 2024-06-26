# Companies House Technical Assessment - Swag Labs website

## Pre-requisites

Please ensure that the following are installed before attempting to clone this repository:

* Java 21
* An IDE such as IntelliJ or Eclipse
* Maven
* Chromedriver

## Configuring ChromeDriver

To find the appropriate ChrimeDriver version that matches your installed version of Chrome, please see the following website - https://googlechromelabs.github.io/chrome-for-testing/

To run these tests you will make use of the `````-Dwebdriver.chrome.driver````` property.
You will need to take note of the path to chromedriver directory on your local machine e.g. `````"C:\Users\<YOUR USERNAME>\.m2\repository\webdriver\chromedriver\win32\125.0.6422.60\chromedriver.exe"`````.
Set the property `````-Dwebdriver.chrome.driver````` to this .exe path in order to run tests e.g.
`````-Dwebdriver.chrome.driver="C:\Users\<YOUR USERNAME>\.m2\repository\webdriver\chromedriver\win32\125.0.6422.60\chromedriver.exe"````` This will be passed as an argument in the command line, shown later on in this README. 

## Running the tests

* Clone this repository on your local machine using the following command(s):

If using HTTPS:
>git clone https://github.com/Jibbas-test/ch-swag-labs.git

If using SSH:
>git clone git@github.com:Jibbas-test/ch-swag-labs.git

* Change into this project's directory
* Run the following command in a terminal window:
>mvn clean install -DbrowserProfile=chrome -Dcucumber.options="--tags @swag_labs" -Dwebdriver.chrome.driver="C:\Users\<YOUR USERNAME>\.m2\repository\webdriver\chromedriver\win32\<CHROMEDRIVER VERSION>\chromedriver.exe"



## Reports
### Extent Test Report
Extent test reports are generated automatically after each test run, each with a specific date and timestamp.  If a test step fails then a screenshot is also captured allowing an easy view of the page under failure.
* Extent reports are generated in the ./test-output folder.
* Navigate to this directory and open the associated HTML file in a browser of your choice.
* In the case of a test failure, a screenshot will be automatically taken and attached to the test report.