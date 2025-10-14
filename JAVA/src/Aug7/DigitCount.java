package Aug7;
/* 
Q5. Count Digits in a Number
Question: Write a Java program to count the number of digits in a given
integer.*/


class DigitCount{
public static void main(String[] args){

int n=458;
int c=0;

while(n!=0)
	{

	c++;
	n=n/10;
	}
System.out.println(c);
}
}