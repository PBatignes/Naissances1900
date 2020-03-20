/**
 * 
 */
package projPOO01.files;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import projPOO01.entities.Naissance;

/**
 *
 * @author Pierre
 *
 */
public class LectureFichier {

	public static List<Naissance> lireFichier() {

		List<Naissance> listN = new ArrayList<>();

		try {
			File file = new File("C:\\dev\\Naissances1900\\naissances_depuis_1900.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);

			for (String s : lignes) {

				String[] morceaux = s.split(";");
					Long annee = Long.parseLong(morceaux[1].trim());
					String stringdate = morceaux[2].trim().substring(0, 4) 
							+ "/" + morceaux[2].substring(4, 6) 
							+ "/" + morceaux[2].substring(6, 8);
					LocalDate date = LocalDate.parse(stringdate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
					Long naissance = Long.parseLong(morceaux[3].trim());

					listN.add(new Naissance(annee, date, naissance));
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return listN;
	}

}
