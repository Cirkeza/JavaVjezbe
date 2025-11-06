package vjezbe;

public class Racunari extends EProizvodi{
	private String procesor;
	private String memorija;
	public Racunari(String opis, String sifra, int uvoznaCijena, String procesor, String memorija) {
		super(opis, sifra, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public String getMemorija() {
		return memorija;
	}
	public void setMemorija(String memorija) {
		this.memorija = memorija;
	}
	@Override
	public String toString() {
		return "Racunari [procesor=" + procesor + ", memorija=" + memorija + "]";
	}

}
