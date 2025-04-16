import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produkt produkt1 = new Produkt();
        produkt1.wyswietlInformacjeProdukt();

        Klient klient1 = new Klient();
        klient1.wyswietlInformacjeKlient();

        Zamowienie zamowienie1 = new Zamowienie();
        zamowienie1.wyswietlInformacjeZamowienie();
    }
}