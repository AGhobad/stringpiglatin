

Given an string, this program converts it to the Pig Latin.

 Pig Latin translation is simply taking the first letter of a "word" and appending that letter to the end of the word with "ay" added to the end as well.  Example:

* "Alex, how did you do question 21?"  should translate to "lexAay, owhay idday ouyay oday uestionqay 21?"
*  

This project is a maven project and I have used junit for testing


To compile:
mvn clean compile
or manually compile by javac


to run:
java -cp target\classes com.quiz.piglatin.StringPigLatin "this is a test"

or 

runit.bat  "this is a test"


javadoc:
 mvn javadoc:javadoc
(see target\site\apidocs)
or
javadoc -d target\classes\javadoc src\main\java\com\quiz\piglatin\StringPigLatin.java

to test:
mvn test
