# IDEA and JUnit

Performed a debugging activity using IntelliJ IDEA and implemented some JUnit tests.  
Specifically, I completed the following tasks:

1. Open a terminal window
1. Clone REPO
1. Create a branch called "development" and switch to it
1. Open IntelliJ IDEA and import the project in `<dir>` as shown in the video demonstration
1. The first main task of this assignment is to debug the system as it has a bug. The bug is in **one** line of code. Test `edu.umn.cs.csci3081w.lab4.EnrollManagerTest.testEnrollStudents` reveals the bug. **You must not modify this test**. You must fix the bug by first localizing the bug. You have to use the debugging featues offered by IntelliJ IDEA. In particular, you have to collect a screenshot of the [Variables panel](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#stopping-debugger) immediately after the buggy line executes. The screenshot should clearly show the values of the variables (one or more of which will contain an erroneus value). After you collect the screenshot, save the screenshot in `<dir>/buggystate` (you can choose the name you prefer for the screenshot) and fix the bug.
1. In the second task, you will create JUnit test cases to avoid having issues with the system in the future. You have to implement test cases for the methods listed below. Make sure that every test method has a suitable oracle (i.e., either an assertion or an expected exception), that the tests are not trivial, and that at least one of the tests for a method that can throw an exception results in an expected exception. In other words, each test should (1) test a specific piece of functionality and (2) check that such piece of functionality behaves as expected. **All tests should pass.**
	1. You should create three test cases for `edu.umn.cs.csci3081w.lab4.MyString.removeNonLetterCharactersInSubstring` and place them in `edu.umn.cs.csci3081w.lab4.MyStringTest`
	1. You should create three test cases for `edu.umn.cs.csci3081w.lab4.MyString.removeNonUpperCaseCharactersInSubstring` and place them in `edu.umn.cs.csci3081w.lab4.MyStringTest`
	1. You should create three test cases for `edu.umn.cs.csci3081w.lab4.Student.hasSameInitials` and place them in `edu.umn.cs.csci3081w.lab4.StudentTest`.
	1. You should create two test cases for `edu.umn.cs.csci3081w.lab4.EnrollManager.enrollStudents` and place them in `edu.umn.cs.csci3081w.lab4.EnrollManagerTest`.
