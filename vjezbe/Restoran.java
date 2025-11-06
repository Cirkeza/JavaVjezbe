package vjezbe;

	import java.util.ArrayList;

	public class Restoran {
	    public String naziv;
	    public String adresa;
	    public String pib;

	    public Restoran(String naziv, String adresa, String pib) {
	        this.naziv = naziv;
	        this.adresa = adresa;
	        this.pib = pib;
	    }

	    public void dodaj(ArrayList<Zaposleni> lista, Zaposleni z) { lista.add(z); }

	    public Zaposleni nadjiPoId(ArrayList<Zaposleni> lista, String id) {
	        for (Zaposleni z : lista) if (z.id.equals(id)) return z;
	        return null;
	    }

	    public boolean ukloniPoId(ArrayList<Zaposleni> lista, String id) {
	        Zaposleni z = nadjiPoId(lista, id);
	        if (z != null) { lista.remove(z); return true; }
	        return false;
	    }

	    public void stampajObracun(ArrayList<Zaposleni> lista, int mjesec, int godina) {
	        System.out.println("Obracun za " + mjesec + "/" + godina);
	        System.out.println("ID     Ime i prezime       Tip        Sati  Dodatno                      Plata(EUR)");
	        for (Zaposleni z : lista) {
	            double plata = z.mjesecnaPlata();
	            String imeprez = z.ime + " " + z.prezime;
	            System.out.printf("%-5s  %-18s  %-9s  %-4d  %-27s  %-10.2f%n",
	                    z.id, imeprez, z.tip, z.satiSedmicno, z.dodatno(), plata);
	        }
	    }

	    public double ukupniTrosak(ArrayList<Zaposleni> lista) {
	        double s = 0;
	        for (Zaposleni z : lista) s += z.mjesecnaPlata();
	        return s;
	    }
	}


