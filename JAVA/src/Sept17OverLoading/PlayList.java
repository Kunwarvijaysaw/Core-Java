package Sept17OverLoading;

public class PlayList {
	
		Song  s;
	  	public void addSong(Song song){
	        System.out.println(song.songId+"added in  Playlist");
	        s = song;
	    }
	  	
	    public String getTotalDuration(){
	        return "in seconds "+s.durationInSecond;
	    }
	    
	    public String getTotalDuration(int duration){
	        int min=duration/60;
	        int second=duration/60;
	       return "Formatted Duration: "+min+" m"+second+" s";
	    }
}
