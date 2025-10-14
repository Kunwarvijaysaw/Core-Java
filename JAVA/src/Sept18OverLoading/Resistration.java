package Sept18OverLoading;

public class Resistration {

	public static void main(String[] args) {
		College c1=new College("KVS");
		College c2=new College("KVS","swathi@gmail.com");
		College c3=new College("KVS","swathi@gmail.com",6204267886L,"Pass");
		System.out.println("===========================");
		System.out.println(c1.display());
		System.out.println("===========================");
		System.out.println(c2.display());
		System.out.println("===========================");
		System.out.println(c3.display());
		

	}

}
class College{
	String name;
	String emailId;
	long mobNo;
	String pass;
	
	public College(String name) {
		this.name=name;
	}
	public College(String name,String emailId) {
		this.emailId=emailId;
		this.name=name;
	}
	
	public College(String name,String emailId,long mobNo,String pass) {
		this.emailId=emailId;
		this.name=name;
		this.mobNo=mobNo;
		this.pass=pass;
	}
	
	public String display() {
		return "Name : "+name+
				"\nEmailId : "+emailId+
				"\nMobile No: "+mobNo+
				"\nPass : "+pass;
				
	}
	
}
