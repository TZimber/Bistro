package aufgaben.aufgabe29;


public class WeinGlas {
    private double inhalt;
    private int fuellHoehe;

    public void setInhalt(double inhalt) {
        this.inhalt = inhalt;
    }

    public void fuellen(int menge) {
        fuellHoehe = fuellHoehe + menge;
    }
}
