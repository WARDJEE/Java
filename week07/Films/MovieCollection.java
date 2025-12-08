package week07.Films;

public class MovieCollection {
    final private int MAX_SIZE = 9;
    private Movie[] movies;
    private int index;
    private boolean isFull;

    public MovieCollection() {
        this.movies = new Movie[this.MAX_SIZE];
        this.index = 0;
        this.isFull = false;
    }

    public Movie[] getMovies() {
        return this.movies;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean getIsFull() {
        return this.isFull;
    }

    public void addMovie(Movie movie){
        if (!this.isFull) {
            this.movies[index] = movie;
            this.index++;
            if (this.index >= this.MAX_SIZE){
                this.isFull = true;
            }
        }

    }


}
