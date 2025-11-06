package vjezbe;

public class EProizvodi {
private String opis;
private String sifra;
private int uvoznaCijena;
public EProizvodi(String opis, String sifra, int uvoznaCijena) {
	super();
	this.opis = opis;
	this.sifra = sifra;
	this.uvoznaCijena = uvoznaCijena;
}
public String getOpis() {
	return opis;
}
public void setOpis(String opis) {
	this.opis = opis;
}
public String getSifra() {
	return sifra;
}
public void setSifra(String sifra) {
	this.sifra = sifra;
}
public int getUvoznaCijena() {
	return uvoznaCijena;
}
public void setUvoznaCijena(int uvoznaCijena) {
	this.uvoznaCijena = uvoznaCijena;
}
@Override
public String toString() {
	return "EProizvodi [opis=" + opis + ", sifra=" + sifra + ", uvoznaCijena=" + uvoznaCijena + "]";
}




}
