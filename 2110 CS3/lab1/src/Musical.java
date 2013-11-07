/**
 * @author Derek
 * extends Play class to contain more information
 * about Musicals
 */
public class Musical extends Play{
	
	//new instance variables
	private String composer;
	private String lyricist;
	
	//constructor
	public Musical(String t, String d, String w, int p, String c, String l) {
		super(t, d, w, p);
		composer = c;
		lyricist = l;
	}
	//getters and setters
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	
	//Override Play method
	public void display(){
		super.display();
		System.out.println("Composer: "+composer);
		System.out.println("Lyricist: "+lyricist);
	}
	
} // end Musical class
