
public class Kamion extends Vozilo {
	 private double kapacitetTereta;
	    private boolean prikolica;
	public Kamion(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja,double kapacitetTereta,boolean prikolica) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		 this.kapacitetTereta = kapacitetTereta;
	        this.prikolica = prikolica;	
	}
	 public double getKapacitetTereta() {
	        return kapacitetTereta;
	    }
	 public void setKapacitetTereta(double kapacitetTereta) {
	        this.kapacitetTereta = kapacitetTereta;
	    }
	 public boolean isPrikolica() {
	        return prikolica;
	    }
	 public void setPrikolica(boolean prikolica) {
	        this.prikolica = prikolica;
	    }
	 @Override
	    public String toString() {
	        return super.toString() +
	               ", Kamion: kapacitet tereta = " + kapacitetTereta +
	               ", prikolica = " + (prikolica ? "da" : "ne");
	    }
}
