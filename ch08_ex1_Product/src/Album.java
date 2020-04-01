
public class Album extends Product {
	//create string for artist, in addition to info from product field
	private String artist;

	//generate empty constructor
	public Album() {
		super();
		artist = "";
		count++;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return code + " (" +artist + "), " + price;
	}
	
	
	
	
	
}
