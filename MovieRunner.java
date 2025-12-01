package collections.sets.hash;
	import java.util.*;
public class MovieRunner {
	public static void main(String[] args) {
		Set<Movie> mv = new HashSet<Movie>();

		mv.add(new Movie());	
		mv.add(new Movie(2022, " Charlie"));
		mv.add(new Movie(2023, " Saaho"));
		mv.add(new Movie(2024, "Salaar"));
		mv.add(new Movie(2025, "Kantara Chapter 1"));
		mv.add(new Movie(2022, " Charlie"));
		mv.add(new Movie(2025, "Kantara Chapter 1"));
		System.out.println("HashSet: "+mv);
		System.out.println("===================================");
		Set<Movie> vm = new LinkedHashSet<Movie>();
		vm.add(new Movie());
		vm.add(new Movie(2022, " Charlie"));
		vm.add(new Movie(2023, " Saaho"));
		vm.add(new Movie(2024, "Salaar"));
		vm.add(new Movie(2025, "Kantara Chapter 1"));
		vm.add(new Movie(2022, "Charlie"));
		vm.add(new Movie(2025, "Kantara Chapter 1"));
		System.out.println("Linked HashSet: "+vm);

	}

}
