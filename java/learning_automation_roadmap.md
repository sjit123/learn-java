# Roadmap for learning Automation

Let's architect a robust 3-month plan to transform you from a Java beginner with manual testing experience into a proficient Automation Testing guru specializing in Selenium, Appium, and Cucumber.

This plan is structured week by week, focusing on progressive learning, practical application through projects, and consistent reinforcement. Remember, consistency and practice are key to mastery!

## 3-Month Automation Testing Mastery Plan: Weekly Breakdown

*Overall Philosophy:  Learn -> Practice -> Apply -> Refine*

**Key Tools Focus:** Selenium WebDriver, Appium, Cucumber, Java, TestNG/JUnit (testing frameworks), build tools (Maven/Gradle - basic familiarity), basic CI/CD concepts.

### Month 1: Foundations & Core Selenium WebDriver (Web Automation Focus)

#### Week 1: Java Refresher & Testing Fundamentals (Groundwork)

**Things to Learn**
1. Java Basics Recap: Data types, operators, control flow (if-else, loops), methods, classes and objects, basic collections (ArrayList, HashMap). 
Focus on practical Java needed for automation.

2. Testing Fundamentals:
    - Why Automation Testing? Benefits, ROI.
    - Manual vs. Automation Testing - When to use what?
    - Software Testing Life Cycle (STLC) basics.
    - Different levels of testing (Unit, Integration, System, Acceptance).
    - Introduction to Test Cases, Test Suites, Test Data.
    - Optional: ISTQB Foundation Level syllabus overview (good to understand terminology).

**Realistic Small Project**
Java Practice: 
Write simple Java programs to solidify basics - e.g., Calculator, String manipulation, basic data processing.

Manual Test Case Design: 
Choose a simple website (like a login page or search functionality). Write 5-10 manual test cases for it.

**Checkpoints:**
- Are you comfortable with basic Java concepts?
- Do you understand the fundamental concepts of software testing and the need for automation?

**Practice Projects:**
- Solve basic Java coding challenges on platforms like HackerRank or LeetCode (easy level).
- Practice writing more manual test cases for different website features.


#### Week 2: Setting up Selenium WebDriver & Basic Interactions (Environment Setup & First Script)

**Things to Learn:**
- Selenium WebDriver Introduction: What is Selenium, components (WebDriver, IDE, Grid).
- Environment Setup:
- Install Java Development Kit (JDK).
- Choose an IDE (IntelliJ IDEA Community Edition - recommended, Eclipse).
- Set up Maven project (or Gradle - Maven is slightly more common in Selenium).
- Add Selenium WebDriver dependency to your project.
- Download browser drivers (ChromeDriver for Chrome, GeckoDriver for Firefox etc.).
- Configure browser driver path in your code.
- Basic WebDriver Commands:
    -   WebDriver interface, ChromeDriver, FirefoxDriver instantiation.
driver.get("URL"), driver.getTitle(), driver.getCurrentUrl(), driver.close(), driver.quit().
    -   Locators: findElement(), findElements() methods. Basic locators: id, name, linkText, partialLinkText.

**Realistic Small Project:**
"Hello Selenium" Script: Write a simple Java-Selenium script to:
    Open a browser (e.g., Chrome).
    Navigate to a website (e.g., Google).
    Print the title of the page.
    Close the browser.

**Checkpoints:**
Have you successfully set up your Selenium environment?
Can you write a basic Selenium script to open a browser and interact with a webpage?

**Practice Projects:**
- Modify your "Hello Selenium" script to navigate to different websites and print their titles.
- Explore different browser driver setups (Firefox, Edge).
- Try using different basic locators to find elements on simple web pages and print their attributes (e.g., text, tag name).

#### Week 3:  Advanced Locators & Element Interactions (Deeper Diving into Web Elements)

**Things to Learn:**
Advanced Locators:
XPath: Absolute vs. Relative XPath, axes, functions.
CSS Selectors: Syntax, combinations, pseudo-classes, pseudo-elements.
Understanding when to use XPath vs. CSS. Best practices for robust locators.
WebElement Interactions:
sendKeys(), click(), clear(), getText(), getAttribute(), isDisplayed(), isEnabled(), isSelected().
Handling dropdowns (using Select class).
Handling checkboxes and radio buttons.
Handling alerts and pop-ups (using Alert interface).
Handling frames/iframes (using switchTo().frame()).
Handling browser windows/tabs (getWindowHandle(), getWindowHandles(), switchTo().window()).

**Realistic Small Project:**
Automate a Login Flow: Choose a website with a simple login form (e.g., demo e-commerce site).
Navigate to the login page.
Locate username and password fields using advanced locators (XPath or CSS).
Enter valid credentials (you might need to create a demo account or use test credentials if available).
Click the login button.
Verify successful login (e.g., by checking for a welcome message or profile link).

**Checkpoints:**
Are you proficient in writing robust locators (XPath and CSS)?
Can you interact with various web elements (input fields, buttons, dropdowns, alerts, frames, etc.)?

**Practice Projects:**
Automate form filling on different websites using various input types.
Practice identifying complex elements using XPath and CSS on challenging web pages.
Explore websites with different types of alerts and frames and practice handling them.

#### Week 4:  TestNG/JUnit Framework & Basic Reporting (Organizing & Structuring Tests)

**Things to Learn:**
Introduction to Testing Frameworks (TestNG or JUnit - Start with TestNG):
Why use a testing framework? Benefits for organization, reporting, execution.
TestNG Annotations: @Test, @BeforeMethod, @AfterMethod, @BeforeClass, @AfterClass, @BeforeSuite, @AfterSuite.
TestNG Assertions: Assert.assertEquals(), Assert.assertTrue(), Assert.assertFalse(), Assert.assertNull(), Assert.assertNotNull().
TestNG Test Suite creation (testng.xml).
Basic reporting in TestNG (default HTML reports).
Waits in Selenium:
Implicit Wait.
Explicit Wait (WebDriverWait, ExpectedConditions).
Fluent Wait (optional, for complex waiting scenarios).
Realistic Small Project:
Refactor Login Automation with TestNG:
Convert your login automation script from Week 3 to use TestNG framework.
Create a TestNG class with @Test method for the login test.
Use @BeforeMethod and @AfterMethod for browser setup and teardown.
Implement assertions to verify login success.
Create testng.xml to run your test suite.
Run your test suite and examine the default TestNG HTML report.

**Checkpoints:**
Are you comfortable using TestNG annotations to structure your tests?
Can you write assertions to validate test outcomes?
Do you understand the different types of waits and when to use them?

**Practice Projects:**
Automate more scenarios on the website you chose (e.g., search functionality, product browsing). Refactor them to use TestNG.
Experiment with different TestNG annotations and explore their usage.
Practice implementing explicit waits for dynamic elements on websites.


### Month 2: Framework Design & Cucumber BDD (Building Robust & Maintainable Automation)**

#### Week 5: Page Object Model (POM) Design Pattern (Improving Code Structure)

**Things to Learn:**

Page Object Model (POM) Design Pattern:
What is POM? Why is it important for maintainability?
Structure of POM: Page Classes, Element Locators, Page Actions.
Benefits of POM: Code reusability, maintainability, readability.
Best practices for designing effective Page Objects.
Refactoring to POM: How to convert existing scripts to POM structure.

**Realistic Small Project:**

Refactor Login Automation to POM:
Refactor your TestNG login automation script from Week 4 to implement POM.
Create Page Classes for Login Page and Home Page (or relevant pages).
Move element locators and actions related to each page into their respective Page Classes.
Update your TestNG test class to use Page Objects for interacting with web elements.

**Checkpoints:**

Do you understand the Page Object Model design pattern and its benefits?
Can you refactor existing scripts to implement POM structure?
Is your code more organized and readable after implementing POM?

**Practice Projects:**

Choose more complex scenarios from your chosen website and design POM for them.
Practice refactoring other automation scripts to use POM.
Explore different strategies for organizing Page Objects (e.g., inheritance, composition).

#### Week 6: Data-Driven Testing & Parameterization (Running Tests with Different Data Sets)

**Things to Learn:**

Data-Driven Testing (DDT) Concept:
Why DDT? Benefits of running tests with multiple data sets.
External Data Sources: Excel files, CSV files, databases (basic concept).
Reading data from Excel files using Apache POI library (or CSV using Java CSV libraries).
Parameterization in TestNG:
@Parameters annotation.
Data Providers (@DataProvider annotation).
Passing parameters from testng.xml or Data Providers to test methods.
Realistic Small Project:
Data-Driven Login Test:
Create an Excel file (or CSV) with login data (username, password, expected result).
Read data from the Excel file using Apache POI in your TestNG test.
Parameterize your login test method to accept username and password as parameters.
Run the login test with multiple sets of data from the Excel file.
Assert test results based on expected outcomes from the data file.

**Checkpoints:**

Do you understand the concept of Data-Driven Testing?
Can you read data from external sources (Excel/CSV) in Java?
Can you parameterize your TestNG tests to run with different data sets?

**Practice Projects:**

Implement Data-Driven Testing for other scenarios (e.g., search functionality with different keywords, registration with different user details).
Explore reading data from different data sources (CSV files).
Experiment with different ways to pass parameters in TestNG.


#### Week 7: Introduction to Cucumber & BDD (Behavior-Driven Development - Part 1)

**Things to Learn:**

Behavior-Driven Development (BDD) Concept:
What is BDD? Benefits of BDD, collaboration, understanding requirements.
Gherkin Language: Feature Files, Scenarios, Steps (Given, When, Then, And, But).
Connecting Feature Files to Step Definitions in Java.
Cucumber Framework setup (add Cucumber dependencies to Maven).
Running Cucumber tests.
Writing basic Feature Files and Step Definitions.
Realistic Small Project:
Simple Cucumber Login Scenario:
Create a Feature file (.feature) for a simple login scenario in Gherkin language.
Write Step Definitions in Java to correspond to the steps in your Feature file.
Use Selenium WebDriver and POM (from Week 5) within your Step Definitions to automate the login flow.
Run your Cucumber Feature file and observe the execution.

**Checkpoints:**

Do you understand the principles of BDD and Gherkin language?
Can you write basic Feature files and Step Definitions?
Can you connect Cucumber Feature files to Java Step Definitions and execute them?

**Practice Projects:**

Write Feature files and Step Definitions for other simple scenarios on your chosen website.
Practice writing Gherkin steps in different ways to express the same scenario.
Explore different Cucumber annotations (e.g., @Before, @After, @BeforeStep, @AfterStep).

#### Week 8: Cucumber Scenario Outlines & Advanced Gherkin (BDD - Part 2, Data & Complexity)

**Things to Learn:**
Cucumber Scenario Outlines:
Using Scenario Outlines for data-driven BDD scenarios.
Examples table in Scenario Outlines.
Parameterization in Step Definitions using Scenario Outline Examples.
Advanced Gherkin Concepts:
Background keyword in Feature files.
Tags in Feature files (@tagname) for organizing and running specific scenarios.
Data Tables in Gherkin steps for passing complex data sets.
Realistic Small Project:
Data-Driven Cucumber Login with Scenario Outline:
Refactor your Cucumber login scenario from Week 7 to use Scenario Outline.
Create an Examples table in your Feature file with different sets of login data.
Parameterize your Step Definitions to receive data from the Scenario Outline Examples table.
Run your Cucumber Feature file and observe data-driven execution.
Implement Background steps for common pre-conditions (e.g., navigating to login page).

**Checkpoints:**

Do you understand how to use Scenario Outlines for data-driven BDD?
Can you use Examples tables to pass data to your Cucumber scenarios?
Are you familiar with Background and Tags in Cucumber?

**Practice Projects:**

Convert other scenarios to use Scenario Outlines for data variation.
Experiment with Data Tables for passing more complex data within Gherkin steps.
Use Tags to categorize and selectively run different sets of Cucumber scenarios.


### Month 3: Mobile Automation & Advanced Topics (Appium & Broadening Horizons)**

#### Week 9: Introduction to Appium & Mobile Automation (Mobile Testing Fundamentals)

**Things to Learn:**

Introduction to Appium: What is Appium? Why use Appium for mobile automation?
Appium Architecture and Components: Appium Server, Client Libraries.
Appium Environment Setup:
Install Appium Server (Node.js and Appium CLI or Appium Desktop).
Install Android SDK and set up Android Emulator or connect real Android device.
Install Xcode and set up iOS Simulator or connect real iOS device (if you have Mac).
Install Appium Java Client dependency in your Maven project.
Inspecting Mobile Elements:
Using UI Automator Viewer (for Android).
Using Xcode Inspector (for iOS).
Basic Appium Commands:
AndroidDriver, IOSDriver instantiation.
Desired Capabilities (for setting up device, app, etc.).
driver.findElement(), driver.sendKeys(), driver.click() - similar to WebDriver but for mobile elements.
driver.quit().
Realistic Small Project:
Basic Mobile App Interaction:
Choose a simple mobile app (pre-built demo app or a very basic app you can install on emulator/device).
Set up Appium environment and connect to an Android emulator (or iOS simulator).
Write a basic Appium script in Java to:
Launch the app.
Find an element (e.g., a button or text field) using Appium locators (e.g., id, accessibilityId, xpath, className, -android-uiautomator, -ios-predicate).
Perform an action (e.g., click a button or enter text).
Close the app.

**Checkpoints:**

Have you successfully set up your Appium environment for Android (or iOS)?
Can you inspect mobile elements using UI Automator Viewer (or Xcode Inspector)?
Can you write a basic Appium script to interact with a mobile app?

**Practice Projects:**

Explore automating basic interactions on different simple mobile apps.
Practice using different Appium locators to identify mobile elements.
Experiment with different desired capabilities to launch apps on different devices/emulators.

#### Week 10: Advanced Mobile Gestures & Hybrid Apps (Mobile Interactions & Specific Scenarios)

**Things to Learn:**
Mobile Gestures in Appium:
TouchAction and MultiTouchAction classes (or newer Actions class in Appium).
Common gestures: tap, doubleTap, longPress, swipe, pinch, zoom, scroll.
Handling Hybrid Apps:
What are hybrid apps? (Web content embedded in native apps).
Switching between native app context and webview context (driver.getContextHandles(), driver.context()).
Automating web elements within hybrid apps using WebDriver locators within webview context.
Realistic Small Project:
Automate Mobile Gestures and Hybrid App Interaction:
Choose a mobile app that demonstrates gestures (e.g., a gallery app or a map app) or a hybrid app (e.g., an e-commerce app with webview sections).
Implement Appium scripts to:
Perform different gestures (swipe, scroll, tap on coordinates etc.).
Switch to webview context if automating a hybrid app.
Automate interactions with web elements within the webview context.

**Checkpoints:**
Can you implement and use mobile gestures in your Appium scripts?
Do you understand how to automate hybrid apps and switch between contexts?
Can you automate web elements within hybrid app webviews?

**Practice Projects:**
Automate more complex gestures on different mobile apps.
Explore automating various scenarios in hybrid apps (e.g., filling forms in webviews, navigating between native and webview sections).
Investigate different approaches to handle scrolling in Appium for different platforms.


#### Week 11: Cross-Browser & Cross-Device Testing (Expanding Test Coverage)

**Things to Learn:**
Cross-Browser Testing (Selenium):
Setting up drivers for different browsers (Chrome, Firefox, Edge, Safari).
Running Selenium tests on different browsers by changing browser driver instantiation.
Understanding browser compatibility issues and strategies to handle them.
Cross-Device Testing (Appium):
Running Appium tests on different Android devices and iOS devices (or emulators/simulators).
Using Desired Capabilities to target specific devices and OS versions.
Challenges of cross-device testing and strategies to mitigate them.
Introduction to Selenium Grid (optional, if time permits): Basic concept of running tests in parallel on different browsers/machines.
Realistic Small Project:
Cross-Browser Selenium Test:
Modify your Selenium test suite (from Week 4 or 5) to run on at least two different browsers (e.g., Chrome and Firefox).
Parameterize browser selection (e.g., using TestNG parameters or system properties).
Run your test suite and verify that it executes successfully on both browsers.
Cross-Device Appium Test (if possible):
If you have access to different Android devices/emulators, modify your Appium script to run on them.
Use Desired Capabilities to target different devices.
Observe test execution on different devices.

**Checkpoints:**
Can you run your Selenium tests on different browsers?
Do you understand the basics of cross-browser testing?
Are you aware of the considerations for cross-device mobile testing?

**Practice Projects:**
Expand your cross-browser Selenium tests to cover more browsers.
If possible, practice running Appium tests on a wider range of devices/emulators.
Explore cloud-based testing platforms like BrowserStack or Sauce Labs (free trials available) to get a glimpse of cross-browser/device testing in the cloud.


#### Week 12: CI/CD Integration & Reporting Enhancements (Automation in the Development Lifecycle)

**Things to Learn:**
Continuous Integration/Continuous Delivery (CI/CD) Basics:
What is CI/CD? Benefits of CI/CD in software development.
Basic CI/CD pipeline stages (Build, Test, Deploy).
Introduction to CI/CD tools (Jenkins - popular open-source option, GitLab CI, CircleCI, GitHub Actions - Jenkins is recommended to start with due to its wide usage).
Triggering automation tests in a CI/CD pipeline (basic concept).
Reporting Enhancements:
Limitations of default TestNG/JUnit reports.
Introduction to advanced reporting libraries: ExtentReports, Allure Report (ExtentReports is slightly easier to start with).
Generating detailed HTML reports with screenshots, logs, steps, etc.
Integrating reporting libraries into your TestNG or Cucumber framework.

**Realistic Small Project:**
Basic CI/CD Integration with Jenkins & Enhanced Reporting:
Set up a basic Jenkins server locally (or use a free cloud CI/CD service if feasible).
Create a simple Jenkins job to:
Checkout your automation project from Git repository (GitHub, GitLab etc.).
Build your project using Maven (or Gradle).
Execute your TestNG or Cucumber test suite.
Publish test results (TestNG default reports or integrate ExtentReports).
Integrate ExtentReports (or Allure) into your existing TestNG or Cucumber framework.
Run your tests through Jenkins job and observe enhanced reports generated in Jenkins.

**Checkpoints:**
Do you understand the basics of CI/CD and its role in automation?
Can you set up a basic CI/CD pipeline using Jenkins (or another tool)?
Can you integrate and use advanced reporting libraries to generate richer test reports?

**Practice Projects:**
Explore different CI/CD tools and their features.
Practice integrating more advanced features into your CI/CD pipeline (e.g., email notifications, test result dashboards).
Customize and enhance your reporting templates with more details and visualizations.
Look into test management tools (like Zephyr, TestRail - optional introduction) for managing test cases and integrating with automation results.

#### Throughout the 3 Months

- Consistent Daily Practice: Dedicate at least 1-2 hours daily to learning and practicing.
- Code Repository (Git): Use Git (GitHub, GitLab, Bitbucket) to version control your code from day one. This is a crucial skill for collaboration and project management.
- Online Resources: Utilize online tutorials, documentation (Selenium Docs, Appium Docs, Cucumber Docs, TestNG Docs), Stack Overflow, automation testing blogs, and communities.

- Networking: Connect with other automation testers online (LinkedIn, forums) to learn from their experiences and get help when needed.
Regular Review: At the end of each week, review what you've learned, identify areas you are struggling with, and plan for the next week.

- Patience and Persistence: Automation testing takes time and effort to master. Be patient with yourself, celebrate small victories, and keep practicing consistently.

#### After 3 Months:

- You should have a solid foundation in Selenium WebDriver, Appium, and Cucumber.
- You will be capable of designing and building robust automation frameworks for web and mobile applications.
- You will understand CI/CD principles and reporting mechanisms for automation.

### Next Steps:
- Deep Dive: Choose a specific area to specialize further (e.g., performance testing, security testing, advanced mobile automation techniques).
- Real-world Projects: Look for opportunities to apply your skills in real projects (personal projects, open-source contributions, or internships/entry-level roles).
- Continuous Learning: The field of automation is constantly evolving. Stay updated with new tools, technologies, and best practices.
Important Notes:

**Adaptability:** 
This plan is a guide. Adjust it based on your learning pace and interests. Some weeks might take longer, others shorter. Focus on understanding concepts well rather than strictly adhering to the weekly schedule.

Focus: While this plan covers web and mobile, you can initially focus more intensely on Selenium WebDriver (web) in the first 2 months and then shift more towards Appium (mobile) in the last month if you prefer a more focused approach.

Tool Versions: Keep an eye on the versions of tools (Selenium, Appium, Cucumber, Java etc.) you are using. Ensure compatibility and refer to the relevant documentation for the specific versions.

By following this structured plan, consistently practicing, and staying curious, you'll be well on your way to becoming an expert in Automation Testing! Good luck on your journey! 