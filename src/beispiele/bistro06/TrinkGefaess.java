package beispiele.bistro06;


public class TrinkGefaess {
    private double inhalt;
    private int fuellHoehe;

    public void setInhalt(double inhalt) {
        this.inhalt = inhalt;
    }

    public void fuellen(int menge) {
        if (fuellHoehe + menge > 100) {
            fuellHoehe = 100;
            System.out.println("Jetzt aber schnell einen Lappen holen");
        } else {
            fuellHoehe = fuellHoehe + menge;
        }
    }

    public void trinken(int menge) {
        fuellHoehe = fuellHoehe - menge;
        System.out.println("Neue Füllhöhe des Glases ist " + fuellHoehe);
    }
}
