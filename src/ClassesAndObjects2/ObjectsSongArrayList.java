package ClassesAndObjects2;

import java.util.ArrayList;
import Objects.Song;
 
public class ObjectsSongArrayList {
	public static void main(String[] args) {
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(new Song("Easy on Me", "Adele", 2021));
		songs.add(new Song("Shivers", "Ed Sheeran", 2021));
		songs.add(new Song("Holy Ghost Fire", "Larkin Poe",2020));
		
		System.out.println("=== List of songs ===");
		for(Song songObject: songs) {
			System.out.println(songObject.getArtist() + ": " + songObject.getName() + " (" + songObject.getYear() + ")");
		}
	}
}
