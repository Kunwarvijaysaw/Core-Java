package Oct07HasARelation;

class AttachmentClass {
	private int sizeInMB;

	public AttachmentClass(int sizeInMB) {
		if(sizeInMB<=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}else {
		this.sizeInMB = sizeInMB;
		}
	}

	public int getSizeInMB() {
		return sizeInMB;
	}

	public void setSizeInMB(int sizeInMB) {
		this.sizeInMB = sizeInMB;
	}
	public int displayAttachmentDetails() {
		return sizeInMB;
	}
	

}
