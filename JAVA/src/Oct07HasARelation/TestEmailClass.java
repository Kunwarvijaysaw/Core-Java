package Oct07HasARelation;

public class TestEmailClass {

	public static void main(String[] args) {
		AttachmentClass a1=new AttachmentClass(5);
		EmailClass e1=new EmailClass("Meeting Agenda", "sumit@example.com", a1);
		System.out.println(e1.displayEmailDetails());

	}

}
