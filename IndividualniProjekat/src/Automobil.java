
public class Automobil extends Vozilo {
	private int brojVrata;
    private String tipMotora;

    public Automobil(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja);
        this.brojVrata = brojVrata;
        this.tipMotora = tipMotora;
    }
    public int getBrojVrata() {
        return brojVrata;
    }
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
    public String getTipMotora() {
        return tipMotora;
    }
    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }
    @Override
    public String toString() {
        return super.toString() +
               ", Automobil: broj vrata = " + brojVrata +
               ", tip motora = " + tipMotora;
    }
}