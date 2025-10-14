package Aug21;
/*Counter in a Function Call
A function incrementCounter() has a local variable count initialized to 0,
and each time the function is called, it increments count and prints it.
What output will be produced if the function is called 3 times in a row?
How would the behavior change if count were declared as a static variable instead of a local variable?*/

class Counter {
     //static int count=0;
	public static  void incrementCounter()
	{
		int count=0;//local 
		count++;
		System.out.println("Count Value : "+count);
	}

	public static void main(String[] args) {
		
			incrementCounter();
			incrementCounter();
			incrementCounter();
			

		}
		
	}


