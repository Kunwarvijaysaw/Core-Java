package com.nit.inheritence13Oct25;

 class Video extends Content {
	 int durationInSeconds;
	 String quality;
	 
	public Video(String title, String uploadedBy, int durationInSeconds, String quality) {
		super(title, uploadedBy);
		this.durationInSeconds = durationInSeconds;
		this.quality = quality;
	}
	 public void  displayVideoInfo() {
		 displayContentInfo();
		 System.out.println("DurationInSeconds : "+durationInSeconds);
		 System.out.println("Quality : "+quality);
	 }
}
