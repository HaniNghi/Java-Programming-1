package Objects;

public class ObjectsSongArray {
	public static void main(String[] args) {
		Song[] songArray = new Song[3];

		songArray[0] = new Song("Easy on Me", "Adele", 2021);
		songArray[1] = new Song("Shivers", "Ed Sheeran", 2021);
		songArray[2] = new Song("Holy Ghost Fire", "Larkin Poe", 2020);

		System.out.println("=== List of songs ===");

		
		for (int i = 0; i < songArray.length; i++) {
			System.out.println(songArray[i].toString());
		}
		
}
	

}
