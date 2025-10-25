package com.nit.varargs;

class Calculator {
	public void findAddition(int... number) {
		int sum=0;
		for(int n:number) {
			sum=sum+n;
		}
		if(sum!=0) {
		System.out.println("Addition of the numbers : "+sum);
		}else {
			System.out.println("Number not provided!");
		}
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.findAddition(10,20,30,40,50);
		c1.findAddition();
		

	}

}

