## **"Health Declaration" Project**   

***

### ***About***    
This project was built as for to ease an everyday task of filling in an "Health Declaration" form for my daughter (due to COVID-19 crisis). <br>
The mission of my Bot was to connect to an Education site, fill in my personal credantials and log in. Afterwards, it fills in the form, 
takes a screenshot of the page and saves it on my computer. The final step was to take this screenshot and send it as an attachment
from a fake Gmail account that I created, to my personal e-mail.<br>
Every morning, a scheduled Windows batch file generated the Jenkins server where I scheduled the job for Bot execution.
The final result was an e-mail with the form, waiting in my inbox daily  :)

### **Project Overview**
***
### **_Infrastructure Characterization:_**
* Page Object Design Pattern - OOP
* Project Layers (Extensions/Workflows/Utilities...)
* Root cause analysis
* External File Support
* Reporting System (including screenshots)
* CI support  

### _Tools & Frameworks used:_
* Selenium WebDriver
* TestNG - Testing Framework
* Commons Email API - for sending email
* Listeners - interface used to generate logs and customize the TestNG reports
* Monte Screen Recorder - for Bot performence recordings (using Listeners)
* [Jenkins CI](https://www.jenkins.io/)- for scheduling execution
* [Allure](http://allure.qatools.ru/) Reports - as the main reporting system of the project
* Windows scheduled batch file - for generating Jenkins server



> ### **Known Issues:**
> For now, there is no need to fill out Health Declaration forms for kids thus the Bot is on vacation.
