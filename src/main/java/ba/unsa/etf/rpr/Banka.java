package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String ime,String prezime){
        Korisnik k1 = new Korisnik(ime,prezime);

        return k1;
    }

    public Uposlenik kreirajNovogUpsoslenika(String ime,String prezime){
        Uposlenik u1 = new Uposlenik(ime,prezime);

        return u1;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k1){
        Racun r = k1.getRacun();

        return r;
    }

}
