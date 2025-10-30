
public class Vozilo {
	 private String proizvodjac;
	 private int godinaProizvodnje;
	 private double kubikaza;
	 private String boja;
	    
	 public Vozilo(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
	        this.proizvodjac = proizvodjac;
	        this.godinaProizvodnje = godinaProizvodnje;
	        this.kubikaza = kubikaza;
	        this.boja = boja;
	 }
	  public String getProizvodjac() {
	        return proizvodjac;
	    }

	    public int getGodinaProizvodnje() {
	        return godinaProizvodnje;
	    }

	    public double getKubikaza() {
	        return kubikaza;
	    }

	    public String getBoja() {
	        return boja;
	    }
	    
	    
	    
	    public void setProizvodjac(String proizvodjac) {
	        this.proizvodjac = proizvodjac;
	    }

	    public void setGodinaProizvodnje(int godinaProizvodnje) {
	        this.godinaProizvodnje = godinaProizvodnje;
	    }

	    public void setKubikaza(double kubikaza) {
	        this.kubikaza = kubikaza;
	    }

	    public void setBoja(String boja) {
	        this.boja = boja;
	    }
	    @Override
	    public String toString() {
	        return "Vozilo: " +
	               "proizvođač = " + proizvodjac +
	               ", godina = " + godinaProizvodnje +
	               ", kubikaža = " + kubikaza +
	               ", boja = " + boja;
	    }
	 
	   
	       
	    
}
public double izracunajRegistraciju() {
    double cijena = 100;

    int godiste;
	if (godiste < 2010) {
        cijena += 30;
    }
    int kubikaza;
	if (kubikaza > 2000) {
        cijena += 50;
    }

    return cijena;
}

public String toString() {
    String marka;
	String godiste;
	String kubikaza;
	return "Vozilo: marka = " + marka +
           ", godiste = " + godiste +
           ", kubikaza = " + kubikaza;
}

