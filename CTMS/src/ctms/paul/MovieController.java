import java.awt.event.*;
import java.util.ArrayList;

public class MovieController {
	private MovieViewer movieViewer;
	
	public MovieController() {
		movieViewer = new MovieViewer(900,900);
		movieViewer.setInsertButtonActionListener(new InsertButtonActionListener());
		movieViewer.setPrintButtonActionListener(new PrintButtonActionListener());
	}
	
	class InsertButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Movie movie = new Movie();
			movie.setTitle(movieViewer.getTitle());
			movie.setGenres(movieViewer.getGenres());
			movie.setLength(movieViewer.getLength());
			movie.setPremiere(movieViewer.getPremiere());
			movie.setRating(movieViewer.getRating());
			movie.setDirector(movieViewer.getDirector());
			movie.setActors(movieViewer.getActors());
			movie.setDescription(movieViewer.getDescription());
			movie.setPosterPath(movieViewer.getPosterPath());
			movie.setIs3D(movieViewer.is3D());
			movie.setIs4D(movieViewer.is4D());
			movie.setIMAX(movieViewer.isIMAX());
			movie.setWithSubtitiles(movieViewer.withSubtitles());
			movie.setDubbed(movieViewer.isDubbed());
			FileHandler<Movie> fh = new FileHandler<Movie>("movies.bin");
			fh.write(movie);
			movieViewer.clear();
		}
	}
	
	class PrintButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			FileHandler<Movie> fh = new FileHandler<Movie>("movies.bin");
			ArrayList<Movie> list = fh.read();
			for(Movie movie: list)
				System.out.println(movie);
		}
	}
}
