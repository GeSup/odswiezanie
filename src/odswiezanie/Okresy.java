package odswiezanie;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Okresy {

	private GregorianCalendar gKalendarz;
	private int aktualnyRok, aktualnyMiesiac, poczatekOkresu, rokBazowy;
	private String aktualnyOkres, nastepnyOkres;

	Okresy() {
		gKalendarz = new GregorianCalendar();
		aktualnyRok = gKalendarz.get(Calendar.YEAR);
		aktualnyMiesiac = gKalendarz.get(Calendar.MONTH);
		if (aktualnyMiesiac < 10) {
			poczatekOkresu = aktualnyRok - 1;
		} else {
			poczatekOkresu = aktualnyRok;
		}
		aktualnyOkres = Integer.toString(poczatekOkresu) + "/"
				+ Integer.toString(poczatekOkresu + 1);
		nastepnyOkres = Integer.toString(poczatekOkresu + 1) + "/"
				+ Integer.toString(poczatekOkresu + 2);
		rokBazowy = poczatekOkresu - 1;
		
	}

	public String getAktulanyOkres() {
		return aktualnyOkres;
	}

	public String getNastepnyOkres() {
		return nastepnyOkres;
	}

	public Integer getRokBazowy() {
	
		return rokBazowy;
	}

	public void setRokBazowy(int rokBazowy) {
		this.rokBazowy = rokBazowy;
	}

}