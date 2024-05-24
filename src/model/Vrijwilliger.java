package model;

// vrijwilliger is a persoon dus extends persoon
// vrijwilliger implementeerd oproepbaar
public class Vrijwilliger extends Persoon implements Oproepbaar {
    // goed de klassendiagram lezen, daar staat dat we een variable / attribuut urenGewerkt toevoegen en dat we een constructor toevoegen.
    // let op geen magic numbers
    // attribuut
    private int urenGewerkt;
    private final int MIN_UREN_GEWERKT = 0;

    @Override
    public double berekenJaarInkomen() {
        return MIN_UREN_GEWERKT;
    }

    // constructor
    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling){
        super(naam, woonplaats, afdeling);
    }
    // methode uit de interface oproepbaar moet je hier concreet maken en dus een body geven, deze is hetzelfde als in zzp
    @Override
    public void huurIn(int uren){
        urenGewerkt += uren; // Het voegt de waarde van uren toe aan urenGewerkt en wijzigt urenGewerkt. Let op urengewerkt + uren geeft alleen de som terug.
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" en is een vrijwilliger");
    }
}
