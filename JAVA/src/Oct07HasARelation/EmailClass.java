package Oct07HasARelation;

public class EmailClass {
	private String subject;
	private String recipient;
	private AttachmentClass attachment;
	public EmailClass(String subject, String recipient, AttachmentClass attachment) {
		
		this.subject = subject;
		this.recipient = recipient;
		this.attachment = attachment;
	}
	public String displayEmailDetails() {
		return "Subject : "+subject+
				"\nRecipient : "+recipient+
				"\nAttachment Size: "+attachment.displayAttachmentDetails()+" MB";
	}

}
