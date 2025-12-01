package collections.sets.hash;

import java.util.Objects;

public class Movie {
	int year;
	String name;
	
	public Movie() {
	
	}

	public Movie(int year, String name) {
		this.year = year;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, year);
	}

	@Override
	public boolean equals(Object obj) {
		if(this.name == null) {
			return true;
		}
		Movie mov = (Movie) obj;
		return this.year == mov.year && this.name.equals(mov.name);
	}

	@Override
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + "]";
	}
	
	

}
