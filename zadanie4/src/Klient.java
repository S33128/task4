public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    public boolean czyStaly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
    public void wyswietlInformacjeKlient() {
        System.out.println("id klienta: "+ id);
        System.out.println("imie klienta: "+ imie);
        System.out.println("nazwisko klienta: "+ nazwisko);
        System.out.println("email klienta: "+ email);
        System.out.println("czy klient jest stały: "+ czyStaly);
    }
}
