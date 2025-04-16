public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscMagazyn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscMagazyn() {
        return iloscMagazyn;
    }

    public void setIloscMagazyn(int iloscMagazyn) {
        this.iloscMagazyn = iloscMagazyn;
    }
    public void wyswietlInformacje(){
        System.out.println("Id produkt: " + id);
        System.out.println("Nazwa produktu: " + nazwa);
        System.out.println("Kategoria produktu: " + kategoria);
        System.out.println("Cena produktu: " + cena);
        System.out.println("Ilosc magazyn produktu: " + iloscMagazyn);
    }
}
