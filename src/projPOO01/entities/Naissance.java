/**
 * 
 */
package projPOO01.entities;

import java.time.LocalDate;

/**
 *
 * @author Pierre
 *
 */
public class Naissance {

	private Long annee;

	private LocalDate date;

	private Long nombre;

	/**Constructor
	 *
	 * @param annee
	 * @param date
	 * @param nombre
	 */
	public Naissance(Long annee, LocalDate date, Long nombre) {
		this.annee = annee;
		this.date = date;
		this.nombre = nombre;
	}

	/**Getter
	 *
	 * @return the annee
	 */
	public Long getAnnee() {
		return annee;
	}

	/**Setter
	 *
	 * @param annee the annee to set
	 */
	public void setAnnee(Long annee) {
		this.annee = annee;
	}

	/**Getter
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**Setter
	 *
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**Getter
	 *
	 * @return the nombre
	 */
	public Long getNombre() {
		return nombre;
	}

	/**Setter
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(Long nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Année : " + annee + " | Date : " + date + " | Naissances : " + nombre;
	}

}
