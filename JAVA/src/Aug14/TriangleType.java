/*Q10. Classify triangle type based on sides
Class Name: TriangleType
Variables:
    int side1, side2, side3
	Sample Input/Output:
    Input: 5, 5, 5 -> Output: Equilateral
    Input: 5, 5, 8 -> Output: Isosceles
    Input: 3, 4, 5 -> Output: Scalene*/

package Aug14;
import java.util.Scanner;

class TriangleType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First side of Triangle is : ");
		int s1 = sc.nextInt();
		System.out.println("Enter Second side of Triangle is : ");
		int s2 = sc.nextInt();
		System.out.println("Enter Third side of Triangle is : ");
		int s3 = sc.nextInt();
		
		if(s1==s2 && s1==s3) {
			System.out.println("Equilateral Triangle");
		}
		else if(s1==s2 || s1==s3 ||s1==s3) {
			System.out.println("Isosceles Triangle");
		}
		else {
			System.out.println("Scalene Triangle");
		}
		
		
		
		
		
	}

}
