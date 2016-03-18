import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class HW59 {
	ArrayList<Film> Emp = new ArrayList<>();
	
	public static void main(String[] args) {
	
		Film film1 = new Film ("SantaBarbara", 1990, "Soap");
		Film film2 = new Film ("Rex", 1997, "Detectiv");
		Film film3 = new Film ("Star Wars", 1993, "Fantasy");
		
		Session s1 = new Session ("Gold duq", "Glushko", "Green Hall", "Morning Session", 9.00, film1);
		Session s2 = new Session ("Rodina", "Panteleymonovskaya", "Small Hall", "Day Session", 13.00, film2);
		Session s3 = new Session ("Moskow", "Varnenskays", "Red Hall", "Evening Session", 20.00, film3);
		Session s4 = new Session ("Gold duq", "Glushko", "Blue Hall", "Morning Session", 10.00, film2);
		Session s5 = new Session ("Zvezdniy", "Dobrovolskogo", "First Hall", "Students Session", 00.00, film1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		

	}

}
