Hi!

This repository was created for mastering Java + Selenium course.

Here you can find my solutions of problems related to the following topics of Java Core:

- arrays (including bubble and selection sorting, 
	generating 1, 2-dimentional arrays of random numbers, 
	calculating min, max, etc.);

- enums (which is used in a game where you guess a celebrity's age);

- collections (one of these programs can search a student/teacher/both by name, surname, faculty);

- inheritance, generics, interfaces related exercises;

- expressions and control statements (used in different math calculations);

- class StringBuilder (in Caesar and Enigma cipher algorithms);

- other tasks on writing / reading from a file, cycles.

Most of these methods are covered by unit tests.


Also among tests you can find simple Selemium Webdriver tests, tests using Page Object and Page Factory patterns, and a BDD Cucumber test.

Maven Surefire plugin and saved drivers allow running a set of tests on different browsers and OS, and Allure framework generates a report.
TestWatcher class' failed() method makes screenshots of failed tests that are attached to an Allure report.
