package dev.neyerdavid;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {
    private  float temperatur;
    private float feuchtigkeit;


    public AktuelleBedingungenAnzeige(Subject wetterDaten) {
        wetterDaten.registriereBeobachter(this);
    }

    @Override
    public void anzeigen() {
        System.out.println("Aktuelle Bedingungen");
        System.out.println("Feuchtigkeit: " + feuchtigkeit + " Temperatur: " + temperatur);
    }

    @Override
    public void aktualisieren(float temp, float feucht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        anzeigen();
    }
}
