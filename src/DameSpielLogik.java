public class DameSpielLogik {

    private static final int BREITE = 8;
    private static final int HOEHE = 8;

    private Spielstein[][] spielfeld;
    private boolean spieler1AmZug;
    private boolean spielende;

    public DameSpielLogik() {
        spielfeld = new Spielstein[BREITE][HOEHE];
        spieler1AmZug = true;
        spielende = false;
    }

    public Spielstein getSpielstein(int x, int y) {
        return spielfeld[x][y];
    }

    public boolean istSpielende() {
        return spielende;
    }

    public void macheZug(int x, int y) {
        // Implementiere den Zug hier
        // ...
    }
}
