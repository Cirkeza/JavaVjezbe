package vjezbe;


public class Zaposleni {
    public String id;
    public String ime;
    public String prezime;
    public String tip;
    public double plataPoSatu;
    public int satiSedmicno;
    public int prekovremeniSedmicno;
    public double bonus;

    public Zaposleni(String id, String ime, String prezime, String tip, double plataPoSatu, int satiSedmicno, int prekovremeniSedmicno, double bonus) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.tip = tip;
        this.plataPoSatu = plataPoSatu;
        this.satiSedmicno = satiSedmicno;
        this.prekovremeniSedmicno = prekovremeniSedmicno;
        this.bonus = bonus;
    }

    public double mjesecnaPlata() {
        if (tip.equals("Konobar")) {
            double osnovno = 4 * satiSedmicno * plataPoSatu;
            double ot = 4 * prekovremeniSedmicno * plataPoSatu * 1.2;
            return osnovno + ot;
        } else if (tip.equals("Kuvar")) {
            return 1500 + 4 * satiSedmicno * plataPoSatu;
        } else if (tip.equals("Menadzer")) {
            return 1300 + 4 * satiSedmicno * plataPoSatu + bonus;
        }
        return 0;
    }

    public String dodatno() {
        if (tip.equals("Konobar") && prekovremeniSedmicno > 0) return "Prekovremeno: " + prekovremeniSedmicno + "h/nedeljno";
        if (tip.equals("Kuvar")) return "Fiksno: 1500";
        if (tip.equals("Menadzer") && bonus > 0) return "Bonus: " + String.format("%.2f", bonus);
        return "-";
    }
}
