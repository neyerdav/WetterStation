package dev.neyerdavid;

import java.util.ArrayList;

public class WetterDaten implements Subject {
    private ArrayList beobachter;
    float temperatur;
    float feuchtigkeit;
    float luftdruck;

    public WetterDaten() {
        beobachter = new ArrayList();
    }

    @Override
    public void registriereBeobachter(Beobachter b) {
        beobachter.add(b);
    }

    @Override
    public void entferneBeobachter(Beobachter b) {
        int i = beobachter.indexOf(b);
        if (i >= 0) {
            beobachter.remove(i);
        }
    }

    @Override
    public void benachrichtigeBeobachter() {
        for(int i = 0; i < beobachter.size(); i++) {
            Beobachter b = (Beobachter)beobachter.get(i);
            b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
        }
    }

    public void messeWerteGeaendert() {
        benachrichtigeBeobachter();
    }

    public void setMesswerte(float temp, float feucht, float druck) {
        this.temperatur = temp;
        this.feuchtigkeit = feucht;
        this.luftdruck = druck;
        messeWerteGeaendert();
    }
}
