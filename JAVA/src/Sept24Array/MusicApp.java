package Sept24Array;
/*5. Music App – Recently Played Songs Tracker
-----------------------------------------------
Scenario:
Your app keeps track of the last 5 songs a user played. When a new song is played,
it should be added at the end, and the oldest one should be removed to maintain a
fixed-size array.

Problem Statement:
Write a Java method to update the list of recently played songs when a new song is
played.

public String[] updateRecentlyPlayed(String[] songs, String newSong) {
    // implement logic
}


Input Example:
songs = ["A", "B", "C", "D", "E"], newSong = "F"
Output:
["B", "C", "D", "E", "F"]
Sample Input
Input Example:
songs = ["A", "B", "C", "D", "E"], newSong = "F"
Sample Output
Output:
["B", "C", "D", "E", "F"]*/
import java.util.*;
class MusicApp{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        
        String arr[]=new String[5];
        System.out.println("Enter Array Element : ");
        for(int i=0;i<5;i++){
            arr[i]=sc.next();
        }
        
        for(int i=0;i<4;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter new Element : ");
        arr[arr.length-1]=sc.next();
        System.out.println(Arrays.toString(arr));
      

       }
   }