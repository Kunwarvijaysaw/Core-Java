package Sept17OverLoading;

public class Song {
	
	 	String songId ;
	    String title;
	    int durationInSecond;
	    
	    Song(String songId,String title,int durationInSecond){
	        this.songId=songId;
	        this.title=title;
	        if(durationInSecond>0){
	        this.durationInSecond=durationInSecond;
	        }
	    }
}
