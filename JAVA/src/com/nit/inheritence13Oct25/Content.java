package com.nit.inheritence13Oct25;

public class Content {
	String title;
	String uploadedBy;
	public Content(String title, String uploadedBy) {
		super();
		this.title = title;
		this.uploadedBy = uploadedBy;
	}
	
	public void displayContentInfo() {
		System.out.println("Title : "+title);
		System.out.println("UploadedBy : "+uploadedBy);
		
	}

}
