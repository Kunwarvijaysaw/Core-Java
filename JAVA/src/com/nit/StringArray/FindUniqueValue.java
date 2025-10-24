package com.nit.StringArray;

class FindUniqueValue {

	public static void main(String[] args) {
		String a="PROGRAMMING";
		String res="";
		for (int i = 0; i < a.length(); i++) {
			int count=0;
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
				
			}
			if(count==1) {
				res=res+a.charAt(i);
			}
			
		}
		System.out.println(res);

	}

}
