package dev.neyerdavid;

public class WetterStation {

    public static void main(String[] args) {
	WetterDaten wetterDaten = new WetterDaten();
	AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);
	VorhersageAnzeige vorhersageAnzeige = new VorhersageAnzeige(wetterDaten);

	wetterDaten.setMesswerte(30, 65, 30.4f);
	wetterDaten.setMesswerte(30, 65, 30.4f);
	wetterDaten.setMesswerte(30, 65, 30.4f);

    }
}
