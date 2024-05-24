package model;

public abstract class Persoon {
    // attributes
    protected final static String DEFAULTWAARDE_NAAM = "onbekend";
    protected final static String DEFAULTWAARDE_WOONPLAATS = "onbekend";
    public static int aantalPersonen = 0;
    protected final int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;

    // constructors
    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.setNaam(naam);
        this.setWoonplaats(woonplaats);
        this.setAfdeling(afdeling);
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULTWAARDE_NAAM);
    }

    // methoden
    public abstract double berekenJaarInkomen();

    @Override
    public String toString() {
        return String.format("%s woont in %s en werkt op afdeling %s", naam, woonplaats, afdeling.toString());
    }

    // getters, setters
    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

}
