package beispiele.bistro03;


public class BierGlas {
    private double inhalt;
    private int fuellHoehe;

    public void setInhalt(double inhalt) {
        this.inhalt = inhalt;
    }

    public void fuellen(int menge) {
        fuellHoehe = fuellHoehe + menge;
    }
}
