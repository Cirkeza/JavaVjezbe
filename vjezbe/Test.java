package vjezbe;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Restoran r = new Restoran("Bistro Kod Luke", "Ulica 1", "12345678");
        ArrayList<Zaposleni> radnici = new ArrayList<Zaposleni>();

        radnici.add(new Zaposleni("001","Petar","Kazic","Konobar",6.5,40,5,0));
        radnici.add(new Zaposleni("002","Janko","Jankovic","Kuvar",7.0,38,0,0));
        radnici.add(new Zaposleni("003","Vuk","Vukovic","Menadzer",10.0,35,0,300));
        radnici.add(new Zaposleni("004","Stefan","Stefanovic","Konobar",6.0,32,0,0));
        radnici.add(new Zaposleni("005","Ivan","Ivanovic","Kuvar",8.0,40,0,0));

        r.stampajObracun(radnici, 11, 2025);
        System.out.printf("Ukupan trosak: %.2f EUR%n", r.ukupniTrosak(radnici));
    }
}
