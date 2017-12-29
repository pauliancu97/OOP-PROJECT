import java.util.ArrayList;
import java.io.Serializable;

public class Movie implements Serializable{
	
	private String title;
	private ArrayList<String> genres;
	private int length;
	private String premiere;
	private Rating rating;
	private String director;
	private ArrayList<String> actors;
	private String description;
	private String posterPath;
	private boolean is3D;
	private boolean is4D;
	private boolean isIMAX;
	private boolean withSubtitiles;
	private boolean dubbed;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getPremiere() {
		return premiere;
	}
	public void setPremiere(String premiere) {
		this.premiere = premiere;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getActors() {
		return actors;
	}
	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public boolean isIs3D() {
		return is3D;
	}
	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}
	public boolean isIs4D() {
		return is4D;
	}
	public void setIs4D(boolean is4d) {
		is4D = is4d;
	}
	public boolean isIMAX() {
		return isIMAX;
	}
	public void setIMAX(boolean isIMAX) {
		this.isIMAX = isIMAX;
	}
	public boolean isWithSubtitiles() {
		return withSubtitiles;
	}
	public void setWithSubtitiles(boolean withSubtitiles) {
		this.withSubtitiles = withSubtitiles;
	}
	public boolean isDubbed() {
		return dubbed;
	}
	public void setDubbed(boolean dubbed) {
		this.dubbed = dubbed;
	}
	
	public String toString() {
		return title + "\n"
				+ genres + "\n"
				+ length + "\n"
				+ premiere + "\n"
				+ rating + "\n"
				+ director + "\n"
				+ actors + "\n"
				+ description + "\n"
				+ posterPath + "\n"
				+ is3D + "\n"
				+ is4D + "\n"
				+ isIMAX + "\n"
				+ withSubtitiles + "\n"
				+ dubbed + "\n";
	}
}
