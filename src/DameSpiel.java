import processing.core.PApplet;

public class DameSpiel extends PApplet {

    private static final int BREITE = 8;
    private static final int HOEHE = 8;
    private static final int FELD_GROESSE = 50;
    private static final int FENSTER_BREITE = BREITE * FELD_GROESSE;
    private static final int FENSTER_HOEHE = HOEHE * FELD_GROESSE;

    private DameSpielLogik spiel;

    public static void main(String[] args) {
        PApplet.main(DameSpiel.class.getName());
    }

    @Override
    public void settings() {
        size(FENSTER_BREITE, FENSTER_HOEHE);
    }

    @Override
    public void setup() {
        spiel = new DameSpielLogik();
    }

    @Override
    public void draw() {
        background(255);
        for (int x = 0; x < BREITE; x++) {
            for (int y = 0; y < HOEHE; y++) {
                if ((x + y) % 2 == 0) {
                    fill(255);
                } else {
                    fill(0);
                }
                rect(x * FELD_GROESSE, y * FELD_GROESSE, FELD_GROESSE, FELD_GROESSE);

                Spielstein stein = spiel.getSpielstein(x, y);
                if (stein != null) {
                    fill(stein.isSpieler1() ? color(255, 0, 0) : color(0, 0, 255));
                    ellipseMode(CENTER);
                    ellipse(x * FELD_GROESSE + FELD_GROESSE / 2, y * FELD_GROESSE + FELD_GROESSE / 2, FELD_GROESSE * 0.8f, FELD_GROESSE * 0.8f);
                }
            }
        }
    }

    @Override
    public void mouseClicked() {
        if (!spiel.istSpielende()) {
            int x = mouseX / FELD_GROESSE;
            int y = mouseY / FELD_GROESSE;
            if (x >= 0 && x < BREITE && y >= 0 && y < HOEHE) {
                spiel.macheZug(x, y);
            }
        }
    }
}
