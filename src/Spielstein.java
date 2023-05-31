// Klasse, um Spielsteine zu repräsentieren
public class Spielstein {

    private boolean spieler1;
    private boolean dame;

    public Spielstein(boolean spieler1, boolean dame) {
        this.spieler1 = spieler1;
        this.dame = dame;
    }

    public boolean isSpieler1() {
        return spieler1;
    }

    public boolean isDame() {
        return dame;
    }
}
