#DATE AND TIME
newer versions (from Java 8 onwards) introduced a much better way to work with them.

1. Legacy Date and Time API (Before Java 8):
	. java.util.Date and java.util.Calendar: in earlier versions of Java, mainclasses for handling date and time
						 Problems: mutable, not thread-safe, and lacked proper timezone handling.

2. Modern Java Date and Time API (Java 8 onwards): Introduced in Java 8, the java.time package offers improved date and time handling.
						   Key Improvements:Immutability and thread-safety, 
								    Clear separation of date and time into specific classes.
								    Extensive support for formatting, parsing, and manipulating dates and times.


##Key Classes in the Modern Date-Time API
1. LocalDate: Represents a date (year, month, day) without time or timezone information.
2. LocalTime: Represents time (hours, minutes, seconds) without a date or timezone.
3. LocalDateTime: Combines both date and time, but still without timezone information.

##Date-Time operations
. Parsing and Formatting: Use DateTimeFormatter to convert between String and date objects, or to format date/time objects into readable strings.
. Arithmetic Operations: eg. plusDays(), minusMonths()
. Date Comparison: isBefore(), isAfter(), and isEqual() to compare dates
. Time Differences: ChronoUnit to calculate the difference between two dates or times in units such as days, months, or years.

How is it thread safe? 
=> As classes in Java are immutable, their state cannot change making them thread safe

● LocalDate.parse(): Converts a string into a LocalDate object.
● getDayOfWeek(): Retrieves the day of the week for the given date.
● ChronoUnit.DAYS.between(): Calculates the difference in days between two dates. 
● DateTimeFormatter: Formats the date and time into a readable string.



#BUILT-IN-FUNCTIONS


Topics Covered:
1. Random Number Generation:
○ Using java.util.Random and Math.random() to generate random numbers.
2. Mathematical Functions:
○ Utilizing Math class methods such as Math.abs(), Math.pow()Math.sqrt(), etc.
3. String Manipulation:
○ Common string operations like length(), substring(), toUpperCase()toLowerCase().
4. Array Utilities:
○ Using Arrays.toString(), Arrays.sort(), andArrays.binarySearch() from java.util.Arrays.

