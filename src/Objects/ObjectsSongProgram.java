package Objects;

public class ObjectsSongProgram {
	public static void main(String[] args) {
		Song firstSong = new Song("Easy on Me", "Adele", 2021);
		Song secondSong = new Song("Shivers", "Ed Sheeran", 2021);
		Song thirdSong = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

		System.out.println(firstSong.toString());
		System.out.println(secondSong.toString());
		System.out.println(thirdSong.toString());
	}
}
