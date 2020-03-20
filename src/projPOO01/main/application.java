/**
 * 
 */
package projPOO01.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import projPOO01.entities.Naissance;
import projPOO01.files.LectureFichier;

/**
 *
 * @author Pierre
 *
 */
public class application {

	public static void main(String[] args) {
		
		List<Naissance> listN = LectureFichier.lireFichier();
		
		//Afficher les donnée de l'année 1900
		listN.stream().filter(e -> e.getAnnee() == 1900).forEach(System.out::println);
		
		//Afficher la somme des naissance de l'année 1900
		long l = listN.stream()
				.filter(e -> e.getAnnee() == 1900)
				.map(e -> e.getNombre())
				.reduce(0l, (x, y) -> x + y);
		System.out.println(l);
		
		//Moyenne des naissance de l'année 1971
		long count = listN.stream()
				.filter(e -> e.getAnnee() == 1971)
				.count();
		
		long moy = listN.stream()
				.filter(e -> e.getAnnee() == 1971)
				.map(e -> e.getNombre())
				.reduce(0l, (x, y) -> ((x + y)));
		
		System.out.println(moy / count);
	}

}
