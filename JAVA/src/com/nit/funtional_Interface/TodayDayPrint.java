package com.nit.funtional_Interface;
/*Q7. Display Today’s Day
--------------------
Scenario:
A smartwatch displays today’s day.

Task Requirements:
Create interface ShowDay:
void display();

Use lambda expression to print a fixed output like:
"Today is Monday"
*/

@FunctionalInterface
interface ShowDay{
	void display();
}
public class TodayDayPrint {

	public static void main(String[] args) {
		ShowDay res=()->System.out.println("Today is : Monday!");
		res.display();
	}

}
