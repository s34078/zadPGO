import Zamowieniee.Zamowienie;

public class SklepKomputerowy {

    private Produkt[] produkty = new Produkt[100]; // Rozmiar przykładowy
    private Klient[] klienci = new Klient[100];
    private Zamowienie[] zamowienia = new Zamowienie[100];
    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;


    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public Klient[] getKlienci() {
        return klienci;
    }

    public void setKlienci(Klient[] klienci) {
        this.klienci = klienci;
    }

    public Zamowienie[] getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(Zamowienie[] zamowienia) {
        this.zamowienia = zamowienia;
    }

    public int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public void setLiczbaProduktow(int liczbaProduktow) {
        this.liczbaProduktow = liczbaProduktow;
    }

    public int getLiczbaKlientow() {
        return liczbaKlientow;
    }

    public void setLiczbaKlientow(int liczbaKlientow) {
        this.liczbaKlientow = liczbaKlientow;
    }

    public int getLiczbaZamowien() {
        return liczbaZamowien;
    }

    public void setLiczbaZamowien(int liczbaZamowien) {
        this.liczbaZamowien = liczbaZamowien;
    }

    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt;
        } else {
            System.out.println("Brak miejsca na nowe produkty.");
        }
    }

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
        } else {
            System.out.println("Brak miejsca na nowych klientów.");
        }
    }

     Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie noweZamowienie = new Zamowienie();
        noweZamowienie.setKlient(klient);
        noweZamowienie.setProdukty(produkty);
        noweZamowienie.setIlosci(ilosci);
        noweZamowienie.setDataZamowienia("2025-04-04"); // Aktualna data
        noweZamowienie.;
        zamowienia[liczbaZamowien++] = noweZamowienie;
        return noweZamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] produkty = zamowienie.getProdukty();
        int[] ilosci = zamowienie.getIlosci();
        for (int i = 0; i < produkty.length; i++) {
            produkty[i].setIloscWMagazynie(produkty[i].getIloscWMagazynie() - ilosci[i]);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equals(kategoria)) {
                produkty[i].wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }


}
