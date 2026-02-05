/*You are given an array of integers where each number represents a bulb’s brightness.
You can turn ON bulbs from left to right.
If the last bulb you turned ON has value X, then the next bulb you turn ON must satisfy:
nextBulb ≤ X + (sum of digits of X)
Your task is to find the maximum number of bulbs you can turn ON by following this rule.
🔹 Example

Input:
5  6  8  14  20
Valid sequence:
5 → 6 → 8 → 14
Output:
4
*/

package CodingInterViewQuestion;

public class Bulb {
	
	//sum of digits
	static int digitSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	
	
	static int findMaxBulb(int bulbs[], int n) {
		int maxCount=0;
		
		for(int i=0;i<n;i++) {
			int count=1;
			int prev=bulbs[i];
			
			for(int j=i+1;j<n;j++) {
				
				if(bulbs[j]<=prev+digitSum(prev)) {
					count++;
					prev=bulbs[j];
				}
			}
			maxCount=Math.max(maxCount, count);
		}
		return maxCount;
		
	}

	public static void main(String[] args) {
		int bulbs[]= {5, 6, 8, 14, 20};
		int n=bulbs.length;
		
/*		int maxCount=0;
		
		for(int i=0;i<n;i++) {
			int count=1;
			int prev=bulbs[i];
			
			for(int j=i+1;j<n;j++) {
				
				if(bulbs[j]<=prev+digitSum(prev)) {
					count++;
					prev=bulbs[j];
				}
			}
			maxCount=Math.max(maxCount, count);
		}
		*/
		int result=findMaxBulb(bulbs, n);
		System.out.println("Maximum no of bulbs : "+result);
	}

}
