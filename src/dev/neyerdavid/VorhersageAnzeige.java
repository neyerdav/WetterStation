package dev.neyerdavid;

public class VorhersageAnzeige implements Beobachter, AnzeigeElement {
    private  float temperatur;
    private float feuchtigkeit;
    private float druck;


    public VorhersageAnzeige(Subject wetterDaten){
        wetterDaten.registriereBeobachter(this);
    }

    @Override
    public void anzeigen() {
        System.out.println("VorhersageAnzeige");
        System.out.println("Feuchtigkeit: " + feuchtigkeit + " Temperatur: " + temperatur + " Druck: " + druck);
    }

    @Override
    public void aktualisieren(float temp, float feucht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.druck = druck;
        anzeigen();
    }
}
