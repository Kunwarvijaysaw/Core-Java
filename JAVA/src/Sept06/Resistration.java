package Sept06;

import java.util.Scanner;

public class Resistration {
	String firstName;


	String lastName;
	int age;
	String gender;
	String department;
	long contactNo;
	String address;
	
	

	public String addDetails() {
		Scanner sc=new Scanner(System.in);
		 Resistration r1=new Resistration();
		 System.out.println("Enter first name : ");
	     this.firstName = sc.nextLine();

	     System.out.println("Enter last name : ");
	     this.lastName = sc.nextLine();

	     System.out.println("Enter age : ");
	     this.age = sc.nextInt();
	     sc.nextLine(); // clear buffer

	     System.out.println("Enter Gender : ");
	     this.gender = sc.nextLine();

	     System.out.println("Enter Department : ");
	     this.department = sc.nextLine();

	     System.out.println("Enter Contact Number : ");
	     this.contactNo = sc.nextLong();
	     sc.nextLine(); // clear buffer

	     System.out.println("Enter address : ");
	     this. address = sc.nextLine();
//	     System.out.println(firstName+"Resistration successfully");
//	     return firstName+"Resistration successfully";
		return firstName+" Resistration successfully";
	     
		
	}
	public void updateDetails() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWhich detail do you want to edit?");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Age");
            System.out.println("4. Gender");
            System.out.println("5. Department");
            System.out.println("6. Contact Number");
            System.out.println("7. Address");
            System.out.println("8. Exit Editing");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter new First Name: ");
                    this.firstName = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new Last Name: ");
                    this.lastName = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new Age: ");
                    this.age = sc.nextInt();
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new Gender: ");
                    this.gender = sc.nextLine();
                    break;
                case 5:
                    System.out.print("Enter new Department: ");
                    this.department = sc.nextLine();
                    break;
                case 6:
                    System.out.print("Enter new Contact Number: ");
                    this.contactNo = sc.nextLong();
                    sc.nextLine();
                    break;
                case 7:
                    System.out.print("Enter new Address: ");
                    this.address = sc.nextLine();
                    break;
                case 8:
                    System.out.println("✅ Exiting edit mode...");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        } 
	while (choice != 8);
    }
	public String display() {
	return	"First Name "+firstName+
		"\n Last name : "+lastName+
		"\n age : "+age+
		"\n Gender : "+gender+
		"\n Department : "+department+
		"\n Contact Number : "+contactNo+
		"\n Address : "+address;
		
		
		
		
	}
	
 public static void main(String[] args) {
	 Resistration r1=new Resistration();
//	Resistration r2 =new Resistration();
	
	 System.out.println("Enter details for Student 1:"); 
	System.out.println(r1.addDetails());
	
//	 System.out.println("Enter details for Student 2:");
//	 System.out.println(r2.addDetails());
	 System.out.println("======== Student 1 details==========");
	 System.out.println(r1.display());
//	 System.out.println("======== Student 2 details==========");
//	 System.out.println(r2.display());
	 
	 System.out.println("\nDo you want to edit details? (yes/no): ");
     Scanner sc = new Scanner(System.in);
     String ans = sc.nextLine();

     if (ans.equalsIgnoreCase("yes")) {
         r1.updateDetails();
     }

     System.out.println("\n======== Final Student details ==========");
     System.out.println(r1.display());
	
}
}
