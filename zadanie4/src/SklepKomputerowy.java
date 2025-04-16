public class SklepKomputerowy {
    private Produkt[] produkty;
    private Klient[] klienci;
    private Zamowienie[] zamowienia;
    private int liczbaProdukt;
    private int liczbaKlient;
    private int liczbaZamowienia;

    public void dodajProdukt(Produkt produkt) {}
    public void dodajKlient(Klient klient) {}
    public void utworzZamowienie(Klient klient, Produkt[] produkt, int[] ilosci) {}
    public void aktualizujStanMagazynu(Zamowienie zamowienie) {}
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {}
    public void wyswietlProuktyWKategori(String kategoria){}
    public void wyswieltZamowieniaKlienta(int idKlienta){}
}
