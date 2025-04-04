import Zamowieniee.Zamowienie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {

SklepKomputerowy sklep = new SklepKomputerowy();

Produkt produkt1=new Produkt();
produkt1.setId(1);
produkt1.setNazwa("Laptop HP");
produkt1.setKategoria("Laptop");
produkt1.setCena(3999.98);
produkt1.setIloscWMagazynie(8);

Produkt produkt2=new Produkt();
produkt2.setId(2);
produkt2.setNazwa("Ładowarka do iphone X");
produkt2.setKategoria("Ładowarka");
produkt2.setCena(150.20);
produkt2.setIloscWMagazynie(20);

Produkt produkt3=new Produkt();
produkt3.setId(3);
produkt3.setNazwa("Samsung Galaxy");
produkt3.setKategoria("Telefon");
produkt3.setCena(1290.90);
produkt3.setIloscWMagazynie(5);

Klient klient1=new Klient();
klient1.setId(1);
klient1.setImie("Michał");
klient1.setNazwisko("Burak");
klient1.setEmail("michal.burak@hotmail.com");
klient1.setCzyStaly(true);

Klient klient2=new Klient();
klient2.setId(2);
klient2.setImie("Patrycja");
klient2.setNazwisko("Grzyb");
klient2.setEmail("grzybak@wp.pl");
klient2.setCzyStaly(false);

sklep.dodajKlient(klient1);
sklep.dodajKlient(klient2);

Produkt[] produktyZamowienia1 = {produkt1, produkt2};
int[] ilosciZamowienia1={1,1};

Zamowienie zamowienie1= sklep.utworzZamowienie(klient1, produktyZamowienia1, ilosciZamowienia1);
zamowienie1.zaastosujeZnizke();
sklep.aktualizujStanMagzynowy(zamowienie1);

    System.out.println("info o zamówieniu;");
    zamowienie1.wyswietlSzczegoly();

    System.out.println("stan magazynowy po zamowieniu");
    sklep.wyswietlProduktyWKategorii("Laptop");
    sklep.wyswietlProduktyWKategorii("Ładowarka");

    sklep.zmienStatusZamowienia(zamowienie1.getId(), "Zrealizowane");
    System.out.println("status zamowienia po aktualizacji");
    zamowienie1.wyswietlSzczegoly();

    Produkt[] produktyZamowienia2 = {produkt2, produkt3};
    int[] ilosciZamowienia2={2,1};

    Zamowienie zamowienie2 = sklep.utworzZamowienie(klient2,produktyZamowienia2,ilosciZamowienia2);
    sklep.aktualizujStanMagzynowy(zamowienie2);

    System.out.println("Zamowienia klient Michał Burak:");
    sklep.wyswietlZamowienioaKlienta(1);










}

}