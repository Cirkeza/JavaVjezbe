package vjezbe;

public class TV extends EProizvodi{ 
private double velicinaEkrana;

public TV(String opis, String sifra, int uvoznaCijena, double velicinaEkrana) {
	super(opis, sifra, uvoznaCijena);
	this.velicinaEkrana = velicinaEkrana;
}

public double getVelicinaEkrana() {
	return velicinaEkrana;
}

public void setVelicinaEkrana(double velicinaEkrana) {
	this.velicinaEkrana = velicinaEkrana;
}

@Override
public String toString() {
	return "TV [velicinaEkrana=" + velicinaEkrana + "]";
}



}
