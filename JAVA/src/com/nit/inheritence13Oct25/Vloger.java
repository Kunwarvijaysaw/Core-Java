package com.nit.inheritence13Oct25;

class Vloger {

	public static void main(String[] args) {
		Photo photo=new Photo("Sunset Bliss", "Emma", "1080x720", "Vintage");
		Video video=new Video("My Vlog", "Liam", 300, "HD");
		photo.displayPhotoInfo();
		System.out.println("");
		video.displayVideoInfo();
	}

}
