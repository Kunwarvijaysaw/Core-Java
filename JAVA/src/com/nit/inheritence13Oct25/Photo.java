package com.nit.inheritence13Oct25;

 class Photo extends Content {
	String resolution;
	String filterUsed;
	
	public Photo(String title, String uploadedBy, String resolution, String filterUsed) {
		super(title, uploadedBy);
		this.resolution = resolution;
		this.filterUsed = filterUsed;
	}
	
	 public void displayPhotoInfo() {
		 displayContentInfo();
		 System.out.println("Resolution : "+resolution);
		 System.out.println("Filter Used : "+filterUsed);
	 }

}
