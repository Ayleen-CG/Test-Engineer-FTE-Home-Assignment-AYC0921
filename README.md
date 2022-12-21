# Test-Engineer-FTE-Home-Assignment-AYC0921
In this repo I'll be sharing my results of the home assignment challenge.

This Project was built taking its test framework design into consideration to make the code more manageable and organized. 

-The solutions for all the scenarios in FEATURE 1 are contained in the PostsTests Class, this contains 3 test cases that verify the 3 requiered scenarios.

-The solutions for all the scenarios in FEATURE 2 are contained in the UpdatePostsTests Class, this contains 2 test cases for the first two scenarios, 
I wasn't able to complete the third scenario due to it requiring posts by other users. The web page states that it is not possible to view other posts but your own.

The code was built utilizing Selenium JAVA in IntelliJ and uses the chrome driver to automate the webpage. It is necesary to install a chrome driver compatible with your browser in the project file, but I included in the file the driver I used.
All other dependencies such as TestNG are also already listed in the POM.XML file.
*Before running the code it is also necesary to change the path of the installed driver to your local directory where it's stored, this should be done in the BaseTest class under the 'test' -> 'java' directory* 
