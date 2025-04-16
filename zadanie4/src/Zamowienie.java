public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt produkt;
    private int ilosc[];
    private String data;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public int[] getIlosc() {
        return ilosc;
    }

    public void setIlosc(int[] ilosc) {
        this.ilosc = ilosc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void wyswietlInformacjeZamowienie() {
        System.out.println("Id zmowienia: "+id);
        System.out.println("Klient zamowienia: "+klient);
        System.out.println("Produkty zamowione: "+produkt);
        System.out.println("Ilosc zamowiona: "+ilosc);
        System.out.println("Data zamowiania: "+data);
        System.out.println("Status zamowienia: "+status);
    }
}
