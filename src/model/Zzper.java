package model;

public class Zzper extends Persoon implements Oproepbaar {
    private double uurtarief;
    private int urenGewerkt;
    private final int MIN_UREN_GEWERKT = 0;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief){
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = MIN_UREN_GEWERKT;
    }

    //override en maak void net als in de interface oproepbaar, die implementeer je namelijk, verwijder ook de return want de methode is nu void
    @Override
    public void huurIn(int uren){
        urenGewerkt += uren; // Het voegt de waarde van uren toe aan urenGewerkt en wijzigt urenGewerkt. Let op urengewerkt + uren geeft alleen de som terug.
    }

    @Override
    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" en is een zzp-er met een uurtarief van %.2f", this.uurtarief);
    }

    //getters en setters
    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }
}
