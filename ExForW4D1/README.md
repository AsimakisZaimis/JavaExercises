Exercise 1

•Create an abstract class named Phone.

•Include a String field for the phone’s brand and a double field for the phone’s price.

•Within the class, include a constructor that requires the phone brand,
and add two get methods—one that returns the brand and one that returns the price.
•Include an abstract method named setPrice(). •Create two child classes of Phone: Android and NonAndroid.

•All Android phones costs  $24.99 and  all NonAndroidphones costs $37.99.

•Write a constructor for each subclass

•Write an application demonstrating that you can create both a Android and a NonAndroidphones, and display their fields.

Exercise 2, extend Exercise 1

•Write an application in which you create an array that holds 10 phones, some Android and some NonAndroid.

•Using a for loop, display details about all 10 phones.

Exercise 3

•Create an abstract Division class with fields for a company’s division name and account number, and an abstract display() method.

•Use a constructor in the superclass that requires values for both fields.

•Create two subclasses named InternationalDivisionand DomesticDivision.

•The InternationalDivisionincludes a field for the country in which the division is located and a field for the language spoken;
its constructor requires both.

•The DomesticDivisionincludes a field for the state in which the division is located;
a value for this field is required by the constructor.

Write an application named UseDivisionthat creates InternationalDivisionand DomesticDivisionobjects for
two different companies and displays information about them. 

Exercise 4

You  must create a MusicalInstrumentto use as a base for different musical instrument object classes such as Piano, Violin, and Drum. The parent MusicalInstrumentcontains methods such as playNote() and outputSound() that apply to every instrument, but you want to implement these methods differently for each type of instrument.

Exercise 5

•You must create a CardGameclass to use as a base class for different card games.

•It contains four methods named shuffle(), deal(), displayRules(), and keepScore().

•The shuffle() method works the same way for every CardGame.

•The methods deal(), displayRules(), and keepScore() operate differently for every subclass (for example, for TwoPlayerCardGames, FourPlayerCardGames, BettingCardGames, and so on)

•How will you construct the CardGamesclass? Class, Interface or abstract class? Why?Exercise 6Imagine the following: You have Dogs. •Some of the dogs are "sofa dogs", they only do what ordinary dogs do.

•You also have dogs that work "working dogs" like hounds, shepherd dogs etc.

•Implement the necessary classes-interfaces. •Attention! Your company might later start dealing with other animals too (birds, mice etc.) 

Exercise 6

Imagine the following: You have Dogs.

•Some of the dogs are "sofa dogs", they only do what ordinary dogs do.

•You also have dogs that work "working dogs" like hounds, shepherd dogs etc.

•Implement the necessary classes-interfaces.

•Attention! Your company might later start dealing with other animals too (birds, mice etc.) 

LocalDates

Create a new program to exercise with LocalDates.
Create a class BootCamp.
This class has 3 variables
name: String
startingDate: LocalDate
endingDate: LocalDate
The program should ask the user to create three Bootcamps.
Ask for name, startingDate and endingDate for each one from the user (keyboard).
Store these Bootcamps in a list.
Then ask the user to enter a date. Check if a bootcamp will be available in that date and inform the user accordingly.
For example, if the user enters 10/10/2020 and a bootcamp is available, then the program should print a message:
Bootcamp SQL will be available in 10 Oct 2020. It starts 01 Oct 2020 and ends 30 Nov 2020.
Otherwise, the message will be: Sorry no bootcamp available in X date.
***Catch any exceptions that might occur. Accepts only Dates in the format dd/MM/yyyy.
***Try to use methods.
