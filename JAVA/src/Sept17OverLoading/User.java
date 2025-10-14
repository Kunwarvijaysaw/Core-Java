package Sept17OverLoading;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter SongId : ");
		String songId=sc.next();
		System.out.println("Enter Title : ");
		String title=sc.next();
		System.out.println("Enter Duration : ");
		int durationInSecond=sc.nextInt();
		Song s1=new Song(songId,title,durationInSecond);
		PlayList p1=new PlayList();
		p1.addSong(s1);
		System.out.println(p1.getTotalDuration());
		System.out.println(p1.getTotalDuration(durationInSecond));
		
	}
}
