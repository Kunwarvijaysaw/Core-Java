package Oct10Array;

public class FactorialNumber {
	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		
		while(temp!=0)
		{
			int fac=1;
			int digit=temp%10;
			for(int i=1;i<=digit;i++)
			{
				fac*=i;
				
				
			}
			sum+=fac;
			temp/=10;
				
		}
		if(sum==num)
		{
			System.out.println(num+" is Strong Number");
		}
		else
		{
			System.out.println(num+" not is Strong Number");
		}
	}

}
