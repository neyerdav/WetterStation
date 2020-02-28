package dev.neyerdavid;

public interface Subject {
    void registriereBeobachter(Beobachter b);
    void entferneBeobachter(Beobachter b);
    void benachrichtigeBeobachter();
}
